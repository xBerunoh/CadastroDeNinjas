package dev.berunoh.CadastroDeNinjas.Ninjas;

import dev.berunoh.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// LOMBOK
@Data // Criar todos os getters e setters
@NoArgsConstructor // Criação de construtores vazio
@AllArgsConstructor // Criação de construtores com argumentos , alem de criar getters e setters.
public class NinjaDTO {


    private Long id;
    private String nome;
    private String email;
    private Integer idade;
    private String imgUrl;
    private String rank;
    private MissoesModel missoes;

}
