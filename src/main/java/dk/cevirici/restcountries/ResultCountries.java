package dk.cevirici.restcountries;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResultCountries extends Result {

    public ResultCountries(Country[] countries){
        this.countries = countries;
    }

    @Getter
    @Setter
    Country[] countries;
}