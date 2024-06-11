package dk.cevirici.restcountries;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public record Translations (String de, String es, String fr, String ja, String it, String br, String pt, String nl, String hr, String fa ){ }
