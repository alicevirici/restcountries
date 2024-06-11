package dk.cevirici.restcountries;

import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RestCountriesController {

    private final RestTemplate restTemplate;
    private final Properties properties;

    public RestCountriesController(ApplicationContext ctx)
    {
        restTemplate = ctx.getBean("restTemplate", RestTemplate.class);
        properties = ctx.getBean("properties", Properties.class);
    }

    @GetMapping("/countries_detailed")
    public CountryDetailed[] countriesDetailed(@RequestParam(value = "name", defaultValue = "all") String name) {

        String url = properties.getWebserviceUrl()+"rest/v2/all";
        RestCountriesApplication.log.info("WebserviceUrl = "+ url);

        CountryDetailed[] countries = restTemplate.getForObject(url, CountryDetailed[].class);

        for(CountryDetailed country : countries){
            RestCountriesApplication.log.info(country.name());
        }

        return countries;
    }

    private void logUrl(String url) {
        RestCountriesApplication.log.info("WebserviceUrl = "+ url);
    }

    private void logError(String error) {
        RestCountriesApplication.log.error(error);
    }

    @GetMapping("/countries")
    public Result countries() {

        String url = properties.getWebserviceUrl()+"rest/v2/all";
        logUrl(url);

        try {
            Country[] countries = restTemplate.getForObject(url, Country[].class);
            if(countries != null && countries.length > 0) {
                return new ResultCountries(countries);
            }
        }
        catch(Exception e)
        {
            logError(e.getMessage());
        }

        return new Result();
    }

    @GetMapping("/countries/{name}")
    public Result countries(@PathVariable("name")  String name) {

        String url = properties.getWebserviceUrl()+"rest/v2/name/"+name;
        logUrl(url);

        try {
            Country2[] country2 = restTemplate.getForObject(url, Country2[].class);
            if (country2 != null && country2.length > 0) {
                return new ResultCountry(country2[0]);
            }
        }
        catch(Exception e)
        {
            logError(e.getMessage());
        }

        return new Result();

    }

}
