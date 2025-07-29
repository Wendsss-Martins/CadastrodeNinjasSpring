package dev.java10x.CadastroDeNinjas.Missoes;

import dev.java10x.CadastroDeNinjas.Ninjas.NinjajModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
//Lombok cria construtores automaticamente
@NoArgsConstructor
@AllArgsConstructor
@Data //todos os getters e setters
public class MissoesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;
    //@OneToMany uma missão para muitos ninjas
    @OneToMany(mappedBy = "missoes")
    private List<NinjajModel> ninjas;
}
