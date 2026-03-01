package projeto.jdm.garage.Carros;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "carros")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarroModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String Marca;

    @Column(nullable = false)
    private String modelo;

    @Column(nullable = false)
    private int AnoFabricacao;

    @Column(nullable = false)
    private String Cor;

}
