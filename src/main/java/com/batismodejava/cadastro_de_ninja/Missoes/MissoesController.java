package com.batismodejava.cadastro_de_ninja.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class MissoesController {

    @GetMapping("missoes/boasVindas")
    public String boasVindasMissoes() {
        return "Primeira mensagem da rota";
    }

    @GetMapping("missoes/listar")
    public String listarMissoes() {
        return "Missões listadas com sucesso!";
    }

    @PostMapping("missoes/criar")
    public String criarMissao() {
        return "Missão criada!";
    }

    @PutMapping("missoes/alterar")
    public String todasMissoes() {
        return "Missão alterada!";
    }

    @DeleteMapping("missoes/excluir")
    public String excluirMissao() {
        return "Missão excluída!";
    }


}
