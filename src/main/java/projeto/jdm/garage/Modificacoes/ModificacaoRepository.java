package projeto.jdm.garage.Modificacoes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModificacaoRepository extends JpaRepository <ModificacaoModel, Long> {
}
