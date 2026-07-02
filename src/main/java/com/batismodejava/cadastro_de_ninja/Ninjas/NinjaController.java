package com.batismodejava.cadastro_de_ninja.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("ninja/boasVindas")
    public String boasVindasNinja() {
        return "Olá, ninja!";
    }

    //Add ninja (CREATE)
    @PostMapping("ninja/criar")
    public String criarNinja() {
        return "Ninja criado!";
    }

    //Mostrar todos os ninjas (READ)
    @GetMapping("ninja/listar")
    public List<NinjaModel> todosNinjas() {
        return ninjaService.todosNinjas();
    }

    //Mostrar ninja por ID (READ)
    @GetMapping("ninja/{id}")
    public String ninjaPorId() {
        return "Ninja encontrado";
    }

    //Alterar dados dos ninjas (UPDATE)
    @PutMapping("ninja/alterar")
    public String alterarNinjaId() {
        return "Alterar Ninja por id";
    }

    //Deletar ninja (DELETE)
    @DeleteMapping("ninja/deletar")
    public String deletarNinjaId() {
        return "Ninja deletado por ID";
    }

}
