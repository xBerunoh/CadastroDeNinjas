package dev.berunoh.CadastroDeNinjas.Missoes;

import dev.berunoh.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Entity // Fazer a nossa classe se tornar uma entidade
@Table (name = "tb_missoes")
@Data // Criar todos os getters e setters
@NoArgsConstructor // Criação de construtores vazio
@AllArgsConstructor // Criação de construtores com argumentos , alem de criar getters e setters.

public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;

    @OneToMany(mappedBy = "missoes") // @OneToMany , muitos elementos podem ter varias missões
    private List<NinjaModel> ninjas;



}
