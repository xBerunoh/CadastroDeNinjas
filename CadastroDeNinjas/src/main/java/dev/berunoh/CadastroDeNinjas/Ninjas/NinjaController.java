package dev.berunoh.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RequestMapping
@RestController
public class NinjaController {

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
    @GetMapping("/todos")
    public String mostrarTodosOsNinjas(){
        return "Mostrar Ninjas";
    }

    // (endpoint) Mostrar todos os ninjas por ID (READ)
    @GetMapping("/todosID")
    public String mostrarTodosOsNinjasPorID(){
        return "Mostrar Ninja por id";
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
