package Teles.Daniel.ExercicioSpringbootGradel;

import Teles.Daniel.ExercicioSpringbootGradel.model.Banda;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author Daniel Teles
 * @version 1.0
 * @since 14/06/2020 - 20:54
 * @category view
 */
@SpringBootApplication
public class ExercicioSpringbootGradelApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(ExercicioSpringbootGradelApplication.class, args);

		Banda banda = applicationContext.getBean(Banda.class);

		banda.setNomeBanda("Iron Maiden");
		banda.setEstiloMusical("Heavy metal");
		banda.setQuantidadeMembros(5);
		banda.setCacheBase(2000000);

		System.out.println(banda);
	}

}
