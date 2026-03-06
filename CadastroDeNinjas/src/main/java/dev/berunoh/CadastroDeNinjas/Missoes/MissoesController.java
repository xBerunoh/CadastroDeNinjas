package dev.berunoh.CadastroDeNinjas.Missoes;

// LOCALHOST:8080

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // ISSO AQUI DEFINE AS NOSSAR ROTAS
@RequestMapping("/missoes") // ISSO AQUI MAPEIA AS NOSSAS ROTAS
public class MissoesController {

    private final MissoesService missoesService;

    public MissoesController(MissoesService missoesService) {
        this.missoesService = missoesService;
    }

    // GET -- Mandar uma requisião para mostrar as missões
    @GetMapping("/listar")
    public List<MissoesModel> listarMissoes(){
        return missoesService.listarMissoes();
    }

    @GetMapping("/listar/{id}")
    public MissoesModel listarMissoesPorId(@PathVariable Long id){
        return missoesService.listarMissoesPorId(id);
    }


    // POST -- Criar uma missão
    @PostMapping("/criar")
    public MissoesModel criarMissao(@RequestBody MissoesModel missoes){
        return missoesService.criarMissoes(missoes);
    }
    // PUT -- Alterar as missões
    @PutMapping("/alterar/{id}")
    public MissoesModel alterarMissao(@PathVariable Long id, @RequestBody MissoesModel missoesAtualizada){
        return missoesService.atualizarMissoes(id,missoesAtualizada);
    }
    // DELETE - Deletar uma missão
    @DeleteMapping("/deletar/{id}")
    public void deletarMissao(@PathVariable  Long id){
        missoesService.deleterMissoes(id);
    }




}
