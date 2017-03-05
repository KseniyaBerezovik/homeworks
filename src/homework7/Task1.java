package homework7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        Collections.addAll(strings,
                "this",
                "is",
                "lots",
                "of",
                "fun",
                "for",
                "every",
                "Java",
                "progtammer"
        );

        markLength4(strings);

        for(String s : strings) {
            System.out.println(s);
        }
    }

    public static void markLength4(List<String> strings) {
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() == 4) {
                strings.add(i, "****");
                i++;
            }
        }
    }
}