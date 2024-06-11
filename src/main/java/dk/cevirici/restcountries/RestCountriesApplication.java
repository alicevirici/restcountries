package dk.cevirici.restcountries;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestCountriesApplication {

	public static final Logger log = LoggerFactory.getLogger(RestCountriesApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(RestCountriesApplication.class, args);

		log.info("App started");
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public Properties properties() { return new Properties(); }
}
