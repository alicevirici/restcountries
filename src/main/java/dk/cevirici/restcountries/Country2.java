package dk.cevirici.restcountries;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Country2 extends Country{

    @Getter
    @Setter
    private String capital;

    @Getter
    @Setter
    private long population;


    private String flag;

    @JsonProperty("flag_file_url")
    public String getFlag() {
        return flag;
    }

    @JsonProperty("flag")
    public void setFlag(String flag) {
        this.flag = flag;
    }

}
