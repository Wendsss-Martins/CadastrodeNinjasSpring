package dev.java10x.CadastroDeNinjas.Ninjas;

import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

// JPA = Java Persistence API
//Entity transforma uma classe em uma entidade no banco de dados
@Entity
@Table(name = "tb_cadastro")
//Lombok cria construtores automaticamente
@NoArgsConstructor
@AllArgsConstructor
@Data //todos os getters e setters
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


}
