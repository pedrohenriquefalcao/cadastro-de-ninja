package com.batismodejava.cadastro_de_ninja.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninja")
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/boasVindas")
    public String boasVindasNinja() {
        return "Olá, ninja!";
    }

    //Add ninja (CREATE)
    @PostMapping("/criar")
    public String criarNinja() {
        return "Ninja criado!";
    }

    //Mostrar todos os ninjas (READ)
    @GetMapping("/listar")
    public List<NinjaModel> todosNinjas() {
        return ninjaService.todosNinjas();
    }

    //Mostrar ninja por ID (READ)
    @GetMapping("/listar/{id}")
    public NinjaModel ninjaPorId(@PathVariable Long id) {
        //PathVariable: anotação para adicionar variável na URL (entre chaves)
        return ninjaService.ninjaPorId(id);
    }

    //Alterar dados dos ninjas (UPDATE)
    @PutMapping("/alterar")
    public String alterarNinjaId() {
        return "Alterar Ninja por id";
    }

    //Deletar ninja (DELETE)
    @DeleteMapping("/deletar")
    public String deletarNinjaId() {
        return "Ninja deletado por ID";
    }

}
