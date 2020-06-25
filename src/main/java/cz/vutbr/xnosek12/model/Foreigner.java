package cz.vutbr.xnosek12.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class Foreigner {
    @JsonProperty("Foreigner")
    private String foreigner;

    @JsonProperty("Count")
    private int count;

    @Override
    public String toString() {
        return foreigner + ": " + count;
    }
}
