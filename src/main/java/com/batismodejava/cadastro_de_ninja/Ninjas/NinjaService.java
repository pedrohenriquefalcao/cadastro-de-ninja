package com.batismodejava.cadastro_de_ninja.Ninjas;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    //Listar todos os meus ninjas
    public List<NinjaModel> todosNinjas() {
        return ninjaRepository.findAll();
    }

    //Listar todos os meus ninjas, agora por ID
    public NinjaModel ninjaPorId(Long id) {
        Optional<NinjaModel> ninjaModelOptional = ninjaRepository.findById(id);
        return ninjaModelOptional.orElse(null);
    }

}
