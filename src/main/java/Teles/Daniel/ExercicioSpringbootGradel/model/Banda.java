package Teles.Daniel.ExercicioSpringbootGradel.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Daniel Teles
 * @version 1.0
 * @since 14/06/2020 - 20:42
 * @category model
 */
@Component
@Getter @Setter
@AllArgsConstructor
public class Banda {


    private String nomeBanda;
    private String estiloMusical;
    private int quantidadeMembros;
    private double cacheBase;

    public double calcularSalarioPorMembro() {
        return this.cacheBase / this.quantidadeMembros;
    }

    @Override
    public String toString() {
        return "\nNome da banda: " + this.nomeBanda
              +"\nEstilo da banda: " + this.estiloMusical
              +"\nQuantidade de membros: " + this.quantidadeMembros
              +"\nCache da banda: " + this.cacheBase
              +"\nSalario por membro: " + this.calcularSalarioPorMembro();
    }


}
