package projeto.jdm.garage.Modificacoes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table (name = "modificacoes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ModificacaoModel {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    @Column(nullable = false)
    private String nomePeca;

    @Column(precision = 10, scale = 2)
    private BigDecimal custo;

    private String descricao;


}
