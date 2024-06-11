package dk.cevirici.restcountries;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

public class Properties {

    @Getter
    @Setter
    @Value("${webservice.url}")
    private String webserviceUrl;
}
