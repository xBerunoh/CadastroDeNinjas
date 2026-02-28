package dev.berunoh.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    // INJETAR DEPENDENCIAS
    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/boasVindas")
    public String boasVindas(){

        return "Essa é a minha primeira mensagem nessa rota";
    }

    // (endpoint) Adicionar ninja (CREATE)
    @PostMapping("/criar")
    public String criarNinja() {
        return "Ninja Criado";
    }

    // (endpoint) Mostrar todos os Ninjas (READ)
    @GetMapping("/listar")
    public List<NinjaModel> listarNinjas(){
        return ninjaService.listarNinjas();
    }

    // (endpoint) Mostrar todos os ninjas por ID (READ)
    @GetMapping("/listarID")
    public List<NinjaModel> listarNinjasID(){
        return listarNinjasID();
    }

    // (endpoint) Alterar dados dos ninjas (UPDATE)
    @PutMapping("/alterarID")
    public String alterarNinjasPorID(){
        return "Alterar Ninja por id";
    }

    // (endpoint) Deleter Ninja (DELETE)
    @DeleteMapping("/deletarID")
    public String deletarNinjaPorID(){
        return "Deletar Ninja por ID";
    }

}
