package dev.berunoh.CadastroDeNinjas.Ninjas;

import dev.berunoh.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

// Entity ele transforma uma classe em uma entidade do BD.
// JPA(Java Persistence API)
@Entity
@Table(name = "tb_cadastro") // Tabela com o nome , utilizando snake case
@Data // Criar todos os getters e setters
@NoArgsConstructor // Criação de construtores vazio
@AllArgsConstructor // Criação de construtores com argumentos , alem de criar getters e setters.
@ToString(exclude = "missoes")
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Geração de números
    @Column (name = "id")
    private Long id;

    @Column (name = "nome")
    private String nome;

    @Column(unique = true) // Essa coluna ela é unica ! utilizando o @Column
    private String email;

    @Column (name = "idade")
    private Integer idade;

    @Column (name = "img_url")
    private String imgUrl;

    @Column (name = "rank")
    private String rank;

    @ManyToOne  // Utilizar o @ManyToMany , para apenas um unico ninja !
    @JoinColumn(name = "missoes_id") // Foreing Key ou chave estrangeira
    //JoinColumn cria uma nova tabela chamada "missoes_id"
    private MissoesModel missoes;



}
