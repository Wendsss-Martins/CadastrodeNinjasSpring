package dev.java10x.CadastroDeNinjas.Ninjas;

import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;

import java.util.List;

// JPA = Java Persistence API
//Entity transforma uma classe em uma entidade no banco de dados
@Entity
@Table(name = "tb_cadastro")
public class NinjajModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;

    //@manytoOne um ninja tem uma unica missão
    @ManyToOne
    @JoinColumn(name = "missoes_id") // Foreign Key ou chave estrangeira
    private MissoesModel missoes;

    public NinjajModel() {
    }

    public NinjajModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }


}
