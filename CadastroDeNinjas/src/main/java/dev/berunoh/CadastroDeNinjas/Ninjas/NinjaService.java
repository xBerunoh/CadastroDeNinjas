package dev.berunoh.CadastroDeNinjas.Ninjas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    // Injeção de Dependencias
    private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    // Metodo: Listar todos os meus ninjas por ID !
    public List<NinjaModel> listarNinjas() {
        return ninjaRepository.findAll();
    }

    // Listar todos os meus ninjas por ID
    public NinjaModel listarNinjasPorId(Long id) {
        // Utilização do Optional , porque o Ninja pode tá ou não !
        Optional<NinjaModel> ninjaModel = ninjaRepository.findById(id); // SELECT * FROM TB_CADASTRO WHERE ID = ?
    return ninjaModel.orElse(null); // Caso não tenha mostra o usuário NULL.
    }

    // Criar um novo um ninja

    public NinjaModel criarNinja(NinjaModel ninja){
        return ninjaRepository.save(ninja);
    }

    // Deletar o Ninja - Tem que ser um metodo void

    public void deletarNinjaPorId(Long id){
         ninjaRepository.deleteById(id);
    }

    // Atualizar o Ninja

    public NinjaModel atualizarNinja(Long id,NinjaModel ninjaAtualizado){
        if(ninjaRepository.existsById(id)){
            ninjaAtualizado.setId(id);
            return ninjaRepository.save(ninjaAtualizado);
        }
        return null;
    }



}
