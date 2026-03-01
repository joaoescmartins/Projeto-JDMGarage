package projeto.jdm.garage.Modificacoes;

import org.springframework.stereotype.Service;
import projeto.jdm.garage.Carros.CarroRepository;
import projeto.jdm.garage.Carros.CarroService;

import java.util.List;

@Service
public class ModificacaoService {

    private final ModificacaoRepository repository;
    private final CarroService carroService;

    public ModificacaoService(ModificacaoRepository repository, CarroService carroService){
        this.repository = repository;
        this.carroService = carroService;
    }

    public ModificacaoModel adicionarModificacao(Long carroId,ModificacaoModel modificacao){
        carroService.buscarPorId(carroId);
        return  repository.save(modificacao);
    }

    public List<ModificacaoModel> listarPorCarro(Long carroId){
        carroService.buscarPorId(carroId);
        return repository.findByCarroId(carroId);
    }
}
