package homework11;

import homework11.reporters.ReportType;
import homework11.reporters.Reporter;
import homework11.reporters.ReporterFactory;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.time.LocalTime;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {
    public static void main(String[] args) throws IOException, ParseException {
        File directory = new File("src" + File.separator + "homework11");
        File log = new File(directory, "log_file.log");
        File report1 = new File(directory, "report1.txt");
        File report2 = new File(directory, "report2.txt");

        List<Entry> contentLogFile = readLogFile(log);

        Reporter simpleReporter = ReporterFactory.createReporter(ReportType.SIMPLE_REPORT);
        simpleReporter.createReport(report1, contentLogFile);

        Reporter difficultReporter = ReporterFactory.createReporter(ReportType.DIFFICULT_REPORT);
        difficultReporter.createReport(report2, contentLogFile);
    }

    public static List<Entry> readLogFile(File log) throws IOException {
        List<Entry> result = new ArrayList<>();
        Scanner scanner = new Scanner(log);

        Pattern pattern = Pattern.compile("(\\d{2}:\\d{2}) ([а-яА-Я\\pP\\s]+)");
        Matcher matcher = pattern.matcher("");

        String previousName = null;
        LocalTime previousTime = null;
        String currentName;
        LocalTime currentTime;

        while (scanner.hasNextLine()) {
            matcher.reset(scanner.nextLine());

            while (matcher.find()) {
                currentTime = LocalTime.parse(matcher.group(1));
                currentName = matcher.group(2);

                if(previousName != null && !previousName.equals("Конец")) {
                    result.add(new Entry(previousTime, currentTime, previousName));
                } else if(previousName != null) {
                    result.add(new Entry(null, null, previousName));
                }
                previousTime = currentTime;
                previousName = currentName;
            }
        }
        scanner.close();
        result.add(new Entry(null, null, "Конец"));
        return result;
    }
}
