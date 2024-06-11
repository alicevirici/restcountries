package dk.cevirici.restcountries;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record CountryDetailed(String name, String[] topLevelDomain, String alpha2Code, String alpha3Code, String[] callingCodes, String capital,
                              String[] altSpellings, String region, String subregion, int population, double[] latlng, String demonym, int area,
                              String gini, String[] timezones, String[] borders, String nativeName, String numericCode, Currency[] currencies,
                              Language[] languages, Translations translations, String flag, RegionalBloc[] regionalBlocs, String cioc){ }
