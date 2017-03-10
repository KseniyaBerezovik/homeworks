package homework8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task1 {
    public static String TEXT = "Java is a general-purpose computer programming language " +
            "Java is intended to let application developers write once run anywhere";

    public static void main(String[] args) {
        List<String> words = Arrays.asList(TEXT.split(" "));
        Map<String, Integer> map = new HashMap<>();

        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        for (String key : map.keySet()) {
            System.out.println(key + " - " + map.get(key));
        }
    }
}
