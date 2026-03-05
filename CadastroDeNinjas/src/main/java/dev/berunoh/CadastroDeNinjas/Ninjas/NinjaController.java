package dev.berunoh.CadastroDeNinjas.Ninjas;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    // INJETAR DEPENDENCIAS
    private final NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/boasVindas")
    public String boasVindas(){

        return "Essa é a minha primeira mensagem nessa rota";
    }

    // (endpoint) Adicionar ninja (CREATE)
    @PostMapping("/criar")
    public ResponseEntity<String> criarNinja(@RequestBody NinjaDTO ninja) {
        NinjaDTO novoNinja = ninjaService.criarNinja(ninja);
        return ResponseEntity.status(HttpStatus.CREATED).
                body("Ninja Criado com sucesso: "+novoNinja.getNome()+" (ID): "+novoNinja.getId());
    }

    // (endpoint) Mostrar todos os Ninjas (READ)
    @GetMapping("/listar")
    public ResponseEntity<List<NinjaDTO>> listarNinjas(){
        List<NinjaDTO> ninjas = ninjaService.listarNinjas();
        return ResponseEntity.ok(ninjas);
    }

    // (endpoint) Mostrar todos os ninjas por ID (READ)
    // Utilizamos o PathVariable na rota {id}
    @GetMapping("/listar/{id}")
    public ResponseEntity<?> listarNinjasID(@PathVariable Long id){
        NinjaDTO ninja=  ninjaService.listarNinjasPorId(id);
        if(ninja!= null){
            return ResponseEntity.ok("Ninja encontrado:\n"+ninja);
        }else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("O Ninja com ID:"+id+" não encontrado");
        }

    }

    // (endpoint) Alterar dados dos ninjas (UPDATE)
    @PutMapping("/alterar/{id}")
    public ResponseEntity<String> alterarNinjasPorID(@PathVariable Long id,@RequestBody NinjaDTO ninjaAtualizado){
        if(ninjaService.listarNinjasPorId(id)!= null){
            ninjaService.atualizarNinja(id,ninjaAtualizado);
            return ResponseEntity.ok("Ninja atualizado com sucesso:\n"
            +"ID:"+id+
                    "\nNome:"+ninjaAtualizado.getNome()+
                    "\nEmail:"+ninjaAtualizado.getEmail()+
                    "\nIdade:"+ninjaAtualizado.getIdade()+
                    "\nImg_url:"+ninjaAtualizado.getImgUrl()+
                    "\nrank:"+ninjaAtualizado.getRank()+
                    "missoes:"+ninjaAtualizado.getMissoes());
        }else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("O Ninja com ID:"+id+" não encontrado");
        }
    }

    // (endpoint) Deleter Ninja (DELETE)
    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<String> deletarNinjaPorID(@PathVariable Long id){
        if(ninjaService.listarNinjasPorId(id) != null){
            ninjaService.deletarNinjaPorId(id);
            return ResponseEntity.ok("Ninja deletado com sucesso: "+" (ID): "+id);

        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("O Ninja com ID: "+id+" não encontrado");
        }


    }

}
