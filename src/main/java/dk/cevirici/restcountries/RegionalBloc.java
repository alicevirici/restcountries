package dk.cevirici.restcountries;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record RegionalBloc(String acronym, String name, String[] otherAcronyms, String[] otherNames){ }
