package com.batismodejava.cadastro_de_ninja.Ninjas;

import com.batismodejava.cadastro_de_ninja.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Column(unique = true)
    private String email;

    private String imgUrl;

    private int idade;

    @ManyToOne
    @JoinColumn(name = "fk_missoes_id")
    private MissoesModel missoes;

}
