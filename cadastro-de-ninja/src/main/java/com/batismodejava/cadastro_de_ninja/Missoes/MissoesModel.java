package com.batismodejava.cadastro_de_ninja.Missoes;

import com.batismodejava.cadastro_de_ninja.Ninjas.NinjaModel;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_missões")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private int nivelDificuldade;

    private NinjaModel ninja;

    public MissoesModel() {
    }

    public MissoesModel(int nivelDificuldade, String titulo) {
        this.nivelDificuldade = nivelDificuldade;
        this.titulo = titulo;
    }

    public int getNivelDificuldade() {
        return nivelDificuldade;
    }

    public void setNivelDificuldade(int nivelDificuldade) {
        this.nivelDificuldade = nivelDificuldade;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
