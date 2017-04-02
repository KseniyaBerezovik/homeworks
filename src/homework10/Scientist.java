package homework10;

import java.util.*;
import java.util.concurrent.Callable;

public class Scientist {
    private String name;
    private Map<RobotPart, Integer> details = new HashMap<>();
    private static final Object lock = new Object();

    public Scientist(String name) {
        this.name = name;
        Arrays.stream(RobotPart.values()).forEach(part -> details.put(part, 0));
    }

    private class Servant implements Callable<List<RobotPart>> {
        @Override
        public List<RobotPart> call() throws Exception {
            Thread.currentThread().setPriority(Thread.NORM_PRIORITY);
            Demo.barrier.await();
            List<RobotPart> parts = new ArrayList<>();
            Random random = new Random();
            for (int i = 0; i < random.nextInt(4) + 1; i++) {
                synchronized (lock) {
                    if (!Dump.damp.isEmpty()) {
                        parts.add(Dump.damp.remove(random.nextInt(Dump.damp.size())));
                    }
                }
            }
            return parts;
        }
    }

    public String getName() {
        return name;
    }

    public void takeDetails(List<RobotPart> parts) {
        parts.forEach(part -> details.put(part, details.get(part) + 1));
    }

    public int getNumberOfRobots() {
        return details.values().stream().mapToInt(i -> i).min().getAsInt();
    }

    public Servant getServant() {
        return new Servant();
    }
}