package com.batismodejava.cadastro_de_ninja.Missoes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MissoesController {

@GetMapping("/boasVindasMissões")
    public String boasVindas() {
        return "Primeira mensagem da rota";
    }


}
