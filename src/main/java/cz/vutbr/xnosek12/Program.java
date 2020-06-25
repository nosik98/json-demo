package cz.vutbr.xnosek12;

import cz.vutbr.xnosek12.model.Foreigner;
import cz.vutbr.xnosek12.util.JsonUtil;
import lombok.SneakyThrows;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Program {
    @SneakyThrows
    public static void main(String[] args) {
        String path = Program.class.getResource("/data.json").getPath();
        String json = String.join("", Files.readAllLines(Path.of(path)));

        List<Foreigner> loaded = Arrays.asList(JsonUtil.fromJson(json, Foreigner[].class));
        loaded.stream()
                .sorted(Comparator.comparingInt(Foreigner::getCount).reversed())
                .forEach(System.out::println);
    }
}
