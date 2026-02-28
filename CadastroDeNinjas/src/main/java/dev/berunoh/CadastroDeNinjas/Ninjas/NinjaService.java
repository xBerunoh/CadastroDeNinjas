package dev.berunoh.CadastroDeNinjas.Ninjas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NinjaService{

    // Injeção de Dependencias
    private NinjaRepository ninjaRepository;
    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    // Metodo: Listar todos os meus ninjas por ID !
    public List<NinjaModel> listarNinjas(){
        return ninjaRepository.findAll();
    }



}
