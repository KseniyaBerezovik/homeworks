package homework8;

import java.util.*;

public class Task1 {
    public static String TEXT = "Java is a general-purpose computer programming language " +
            "Java is intended to let application developers write once run anywhere";

    public static void main(String[] args) {
        List<String> words = Arrays.asList(TEXT.split(" "));

        for (String s : new HashSet<>(words)) {
            System.out.println(s + " - " + Collections.frequency(words, s));
        }
    }
}
