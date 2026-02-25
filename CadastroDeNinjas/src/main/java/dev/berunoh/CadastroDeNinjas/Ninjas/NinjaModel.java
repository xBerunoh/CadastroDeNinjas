package dev.berunoh.CadastroDeNinjas.Ninjas;

import dev.berunoh.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

// Entity ele transforma uma classe em uma entidade do BD.
// JPA(Java Persistence API)
@Entity
@Table(name = "tb_cadastro") // Tabela com o nome , utilizando snake case
@Data // Criar todos os getters e setters
@NoArgsConstructor // Criação de construtores vazio
@AllArgsConstructor // Criação de construtores com argumentos , alem de criar getters e setters.

public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Geração de números
    private long id;
    private int idade;
    private String email;
    private String nome;

    // Utilizar o @ManyToMany , para apenas um unico ninja !
    @ManyToOne
    @JoinColumn(name = "missoes_id") // Foreing Key ou chave estrangeira
    //JoinColumn cria uma nova tabela chamada "missoes_id"
    private MissoesModel missoes;



}
