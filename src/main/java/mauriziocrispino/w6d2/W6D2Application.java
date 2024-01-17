package mauriziocrispino.w6d2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "mauriziocrispino.w6d2")
public class W6D2Application {

	public static void main(String[] args) {
		SpringApplication.run(W6D2Application.class, args);
	}

}
