package projeto.jdm.garage.Modificacoes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ModificacaoRepository extends JpaRepository <ModificacaoModel, Long> {

    List<ModificacaoModel> findByCarroId(Long carroId);
}


