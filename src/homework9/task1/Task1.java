package homework9.task1;

import java.io.*;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) throws IOException {
        File directory = new File("src" + File.separator + "homework9" + File.separator + "task1");
        File poem = new File(directory, "poem.txt");
        File result = new File(directory, "result.txt");
        Map<Character, Integer> map = new TreeMap<>();

        try(Scanner scanner = new Scanner(poem);
            Writer writer = new BufferedWriter(new FileWriter(result))) {
            while (scanner.hasNextLine()) {
                Pattern pattern = Pattern.compile("[а-яё]");
                Matcher matcher = pattern.matcher(scanner.nextLine().toLowerCase());
                while (matcher.find()) {
                    char letter = matcher.group().charAt(0);
                    map.put(letter, map.containsKey(letter) ? map.get(letter) + 1 : 1);
                }
            }
            for(Map.Entry<Character, Integer> entry : map.entrySet()) {
                writer.write(entry.getKey() + " " + entry.getValue() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}