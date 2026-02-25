package dev.berunoh.CadastroDeNinjas;

import jakarta.persistence.*;

// Entity ele transforma uma classe em uma entidade do BD.
// JPA(Java Persistence API)
@Entity
@Table(name = "tb_cadastro") // Tabela com o nome , utilizando snake case
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Geração de números

    private long id;
    private String nome;
    private int idade;
    private String email;


    // All Constructor
    public NinjaModel(int idade, String email, String nome) {
        this.idade = idade;
        this.email = email;
        this.nome = nome;
    }
    // No All Constructor
    public NinjaModel() {
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
