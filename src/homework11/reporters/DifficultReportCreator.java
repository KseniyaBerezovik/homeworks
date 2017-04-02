package homework11.reporters;

import homework11.Activity;
import homework11.Entry;

import java.io.*;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class DifficultReportCreator implements Reporter {
    private Writer writer;
    private Map<Activity, Long> activityMap = new EnumMap<>(Activity.class);
    private Map<String, Integer> lecturesMap = new HashMap<>();
    private int durationAllLectures = 0;
    private int from = 0;
    private int to = 0;

    public void createReport(File destination, List<Entry> logContent) throws IOException {
        writer = new BufferedWriter(new FileWriter(destination));
        int countDays = 1;
        while (to < logContent.size() - 1) {
            writer.write("День: " + countDays + " \n");
            countDays++;
            Entry endOfDay = logContent.subList(from, logContent.size())
                    .stream()
                    .filter(entry -> entry.getDescription().equals("Конец"))
                    .findFirst()
                    .get();

            to = logContent.indexOf(endOfDay);
            processOneDay(logContent.subList(from, to));
            from = to + 1;
            writer.write("\n");
        }
        writeStatisticsOfLectures();

        writer.flush();
        writer.close();
        System.out.println("Отчет №2 построен.");
    }

    private void processOneDay(List<Entry> list) throws IOException {
        long durationOfOneDay = 0;
        activityMap.clear();
        Arrays.stream(Activity.values()).forEach(value -> activityMap.put(value, 0L));
        for (Entry entry : list) {
            boolean isLectures = true;
            long duration = ChronoUnit.MINUTES.between(entry.getStartTime(), entry.getEndTime());
            for (Activity activity : Activity.values()) {
                if (activity.toString().equals(entry.getDescription())) {
                    activityMap.put(activity, activityMap.get(activity) + duration);
                    isLectures = false;
                }
            }
            if (isLectures) {
                activityMap.put(Activity.LECTURES, activityMap.get(Activity.LECTURES) + duration);
                String nameOfLecture = entry.getDescription();
                lecturesMap.put(nameOfLecture, lecturesMap.containsKey(nameOfLecture) ?
                        (int) (lecturesMap.get(nameOfLecture) + duration) :
                        (int) duration);
                durationAllLectures += duration;
            }
            durationOfOneDay += duration;
        }

        for (Map.Entry<Activity, Long> pair : activityMap.entrySet()) {
            writer.write(pair.getKey().toString()
                    + ": " + pair.getValue() + " минут "
                    + getPath(durationOfOneDay, pair.getValue()) + "%\n");
        }
    }

    private void writeStatisticsOfLectures () throws IOException {
        writer.write("Лекции: \n");
        for(Map.Entry<String, Integer> pair : lecturesMap.entrySet()) {
            writer.write(pair.getKey()
                    + ": " + pair.getValue() + " минут "
                    + getPath(durationAllLectures, pair.getValue()) + "%\n");
        }
    }

    private int getPath(long all, long path) {
        return  (int) Math.round((double) path * 100 / all);
    }
}