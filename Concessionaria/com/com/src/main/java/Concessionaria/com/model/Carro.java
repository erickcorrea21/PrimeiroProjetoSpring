package Concessionaria.com.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "carros")
public class Carro {

    @Id
    @Getter
    @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O carro precisa de um modelo!")
    private String modelo;

    @NotBlank(message = "Marca é necessário.")
    private String marca;

    @NotBlank(message = "O ano do carro precisa ser preenchido!")
    private Integer ano;

    @NotBlank(message = "Deve-se informar o preço do carro.")
    @Positive(message = "O preço deve ser valor positivo!")
    private BigDecimal preco;

    private Boolean disponivel;

    private BigDecimal margemLucro;

    public Carro() {
    }
}
