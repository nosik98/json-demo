package cz.vutbr.xnosek12.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.SneakyThrows;

import java.io.StringReader;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class JsonUtil {
    @SneakyThrows
    public static <T> T fromJson(String json, Class<T> clazz) {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(new StringReader(json), clazz);
    }
}
