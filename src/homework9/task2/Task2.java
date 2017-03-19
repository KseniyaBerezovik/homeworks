package homework9.task2;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) throws IOException, InterruptedException {
        File directory = new File("src" + File.separator + "homework9" + File.separator + "task2");
        File numbersFile = new File(directory, "numbers.txt");
        numbersFile.createNewFile();

        writeToFile(numbersFile, getRandomList());

        List<Integer> sortedList = Files
                .lines(numbersFile.toPath())
                .map(Integer::parseInt)
                .sorted()
                .collect(Collectors.toList());

        File tempFile = new File(directory, "temp.txt");

        writeToFile(tempFile, sortedList);

        numbersFile.delete();

        //tempFile.renameTo(numbersFile);
        //Files.move(tempFile.toPath(), tempFile.toPath().resolveSibling(numbersFile.getAbsolutePath()), StandardCopyOption.REPLACE_EXISTING);
        //Files.move(tempFile.toPath(), directory.toPath().resolve(numbersFile.getAbsolutePath()), StandardCopyOption.REPLACE_EXISTING);

        Files.move(tempFile.toPath(), tempFile.toPath().resolveSibling("mockNumbers.txt"), StandardCopyOption.REPLACE_EXISTING);
    }

    public static void writeToFile(File file, List<Integer> list) {
        try (Writer writer = new PrintWriter(file)) {
            for (Integer i : list) {
                writer.write(i + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Integer> getRandomList() {
        List<Integer> randomList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < random.nextInt(100 + 1); i++) {
            randomList.add(random.nextInt(1000));
        }
        return randomList;
    }
}