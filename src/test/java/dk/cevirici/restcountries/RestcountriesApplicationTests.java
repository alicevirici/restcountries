package dk.cevirici.restcountries;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class RestcountriesApplicationTests {


	@Autowired
	private RestCountriesController controller;

	@Test
	void contextLoads() throws Exception {
		assertThat(controller).isNotNull();
	}

	@Test
	void expectResultUponCountriesLookup() throws Exception {
		assertThat(((ResultCountries)controller.countries()).getCountries().length > 0).isNotNull();
	}

	@Test
	void expectCorrectFinlandCountryCode() throws Exception {
		assertThat(((ResultCountry)controller.countries("Finland")).getCountry_code()).isEqualTo("FI");
	}

	@Test
	void expectCorrectFinlandCapital() throws Exception {
		assertThat(((ResultCountry)controller.countries("Finland")).getCapital()).isEqualTo("Helsinki");
	}

}
