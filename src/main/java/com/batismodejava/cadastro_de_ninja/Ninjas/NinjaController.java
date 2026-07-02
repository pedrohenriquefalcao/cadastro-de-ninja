package com.batismodejava.cadastro_de_ninja.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/ninjaBoasVindas")
    public String boasVindas() {
        return "Olá, ninja!";
    }

    //Add ninja (CREATE)
    @PostMapping("/criarNinja")
    public String criarNinja() {
        return "Ninja criado";
    }

    //Mostrar todos os ninjas (READ)
    @GetMapping("/todosNinjas")
    public String todosNinjas() {
        return "Lista de todos os ninjas";
    }

    //Mostrar ninja por ID (READ)
    @GetMapping("/ninja/{id}")
    public String ninjaPorId() {
        return "Ninja encontrado";
    }

    //Alterar dados dos ninjas (UPDATE)
@PutMapping("/alterarNinjaId")
    public String alterarNinjaId() {
        return "Alterar Ninja por id";
}

    //Deletar ninja (DELETE)
@DeleteMapping("/deletarNinjaId")
    public String deletarNinjaId() {
        return "Ninja deletado por ID";
    }

}
