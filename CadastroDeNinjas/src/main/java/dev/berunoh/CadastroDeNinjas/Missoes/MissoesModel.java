package dev.berunoh.CadastroDeNinjas.Missoes;

import dev.berunoh.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import org.springframework.web.bind.annotation.RequestMapping;


@Entity // Fazer a nossa classe se tornar uma entidade
@Table (name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;

    @OneToMany(mappedBy = "missoes") // @OneToMany , muitos elementos podem ter varias missões
    private NinjaModel ninjas;



}
