package projeto.jdm.garage.Carros;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Indica que esta interface é um componente de acesso a dados
public interface CarroRepository extends JpaRepository<CarroModel, Long> {

}