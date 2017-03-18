package homework9.task1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;

public class Task1WithStreams {
    public static void main(String[] args) throws IOException {
        Files
                .lines(Paths.get("src" + File.separator + "homework9" + File.separator + "task1" + File.separator + "poem.txt"))
                .reduce("", (st1, st2) -> st1 + st2)
                .chars()
                .mapToObj(e -> Character.toLowerCase((char) e))
                .collect(Collectors.groupingBy(Function.identity(), counting()))
                .entrySet()
                .stream()
                .sorted((e1, e2) -> e1.getKey().compareTo(e2.getKey()))
                .forEach(System.out::println);
    }
}
