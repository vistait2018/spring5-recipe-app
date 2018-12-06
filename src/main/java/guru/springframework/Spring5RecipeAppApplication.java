package guru.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring5RecipeAppApplication {

	public static void main(String[] args) {

		ApplicationContext ctx  =SpringApplication.run(Spring5RecipeAppApplication.class, args);
		System.out.print("*****************Beans*************************");


	}
}
