package dk.cevirici.restcountries;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Language(String iso639_1, String iso639_2, String name, String nativeName) {}
