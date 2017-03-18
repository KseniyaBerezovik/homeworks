package homework9.task2;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) throws IOException {
        File directory = new File("src" + File.separator + "homework9" + File.separator + "task2");
        File original = new File(directory, "originalNumbers.txt");
        File result = new File(directory, "resultNumbers.txt");
        original.createNewFile();
        result.createNewFile();
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        try(Writer writer = new BufferedWriter(new FileWriter(original));
            Writer resultWriter = new BufferedWriter(new FileWriter(result))) {
            for(int i = 0; i < random.nextInt(100 + 1); i++) {
                int nextRandom = random.nextInt(1000);
                writer.write( nextRandom + "\n");
                numbers.add(nextRandom);
            }

            Collections.sort(numbers);

            for(Integer i : numbers) {
                resultWriter.write(i + "\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        original.delete();
        result.renameTo(original);
    }
}