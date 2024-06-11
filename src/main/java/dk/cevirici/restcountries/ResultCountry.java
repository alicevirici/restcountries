package dk.cevirici.restcountries;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResultCountry extends Result {

    public ResultCountry(Country2 country2) {
        this.name = country2.getName();
        this.country_code = country2.getAlpha2Code();
        this.capital = country2.getCapital();
        this.population = country2.getPopulation();
        this.flag_file_url = country2.getFlag();
    }

    @Getter
    @Setter
    String name;

    @Getter
    @Setter
    String country_code;

    @Getter
    @Setter
    String capital;

    @Getter
    @Setter
    long population;

    @Getter
    @Setter
    String flag_file_url;
}