package homework11.reporters;

import homework11.Entry;

import java.io.*;
import java.util.List;

public class SimpleReportCreator implements Reporter {
    private  Writer writer;

    public void createReport(File destination, List<Entry> logContent) throws IOException {
        writer = new BufferedWriter(new FileWriter(destination));
        int countDays = 1;
        writer.write("День " + countDays + ":\n");

        for(Entry entry : logContent.subList(0, logContent.size() - 1)) {
            if(entry.getDescription().equals("Конец")) {
                countDays++;
                writer.write("\nДень: " + countDays + "\n");
            } else {
                writer.write(entry.toString() + "\n");
            }
        }
        writer.flush();
        writer.close();
        System.out.println("Отчет №1 построен.");
    }
}
