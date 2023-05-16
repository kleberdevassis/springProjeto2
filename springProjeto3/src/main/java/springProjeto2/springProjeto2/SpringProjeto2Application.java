package springProjeto2.springProjeto2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EntityScan(basePackages = "springProjeto2.springProjeto2.Model")
@ComponentScan(basePackages = {"springProjeto2.*"})
@EnableJpaRepositories(basePackages = {"springProjeto2.springProjeto2.Repository"})
@EnableTransactionManagement
public class SpringProjeto2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringProjeto2Application.class, args);
	}

}
