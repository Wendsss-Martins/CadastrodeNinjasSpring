package dev.java10x.CadastroDeNinjas;

import jakarta.persistence.*;

// JPA = Java Persistence API
//Entity transforma uma classe em uma entidade no banco de dados
@Entity
@Table(name = "tb_cadastro_de_ninjas")
public class NinjajModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String nome;
    String email;
    int idade;

    public NinjajModel() {
    }

    public NinjajModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }


}
