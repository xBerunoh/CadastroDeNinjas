package dev.berunoh.CadastroDeNinjas.Missoes;

// LOCALHOST:8080

import org.springframework.web.bind.annotation.*;

@RestController // ISSO AQUI DEFINE AS NOSSAR ROTAS
@RequestMapping("/missoes") // ISSO AQUI MAPEIA AS NOSSAS ROTAS
public class MissoesController {


    // GET -- Mandar uma requisião para mostrar as missões
    @GetMapping("/listar")
    public String listarMissoes(){
        return "Missões listadas com sucesso";
    }
    // POST -- Criar uma missão
    @PostMapping("/criar")
    public String criarMissao(){
        return "Missão criada";
    }
    // PUT -- Alterar as missões
    @PutMapping("/alterar")
    public String alterarMissao(){
        return "Missão alterada";
    }
    // DELETE - Deletar uma missão
    @DeleteMapping("/deletar")
    public String deletarMissao(){
        return "Missão deletada";
    }




}
