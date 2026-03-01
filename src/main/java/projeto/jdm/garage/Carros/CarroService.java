package projeto.jdm.garage.Carros;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarroService {

    private final CarroRepository repository;

    public CarroService(CarroRepository repository){
        this.repository=repository;
    }

    public Carro salvar (Carro carro){
        return repository.save(carro);
    }

    public List<Carro> listarTodos(){
        return repository.findAll();
    }

    public Carro buscarPorId(Long id){
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Carro não está na garagem!"));
    }

}
