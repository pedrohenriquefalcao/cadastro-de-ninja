package com.batismodejava.cadastro_de_ninja.Missoes;

import com.batismodejava.cadastro_de_ninja.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_missões")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private int nivelDificuldade;

    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas;


}
