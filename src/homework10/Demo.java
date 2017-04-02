package homework10;

import java.util.List;
import java.util.concurrent.*;

public class Demo {
    public static CyclicBarrier barrier = new CyclicBarrier(3);
    private static ExecutorService executorService = Executors.newFixedThreadPool(3);

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Scientist max = new Scientist("Max");
        Scientist bob = new Scientist("Bob");
        Factory factory = new Factory();

        for (int i = 0; i < 100; i++) {
            executorService.submit(factory);
            Future<List<RobotPart>> futureForMax = executorService.submit(max.getServant());
            Future<List<RobotPart>> futureForBob = executorService.submit(bob.getServant());

            max.takeDetails(futureForMax.get());
            bob.takeDetails(futureForBob.get());

            demo(max);
            demo(bob);

            Thread.sleep(100);

            System.out.println();
            System.out.println();
        }
        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.SECONDS);
        printWinner(max, bob);
    }

    public static void demo(Scientist scientist) {
        for(int i = 0; i < scientist.getNumberOfRobots(); i++) {
            System.out.print("~~ ");
        }
        System.out.println(scientist.getName());
    }

    public static void printWinner(Scientist first, Scientist second) {
        String print = "%s собрал %d роботов. ";
        System.out.print(String.format(print, first.getName(), first.getNumberOfRobots()));
        System.out.println(String.format(print, second.getName(), second.getNumberOfRobots()));
        Scientist winner = getWinner(first, second);
        System.out.print("Итог соревнования: ");
        if (winner == null) {
            System.out.println("Ничья!");
        } else {
            System.out.println("Победил " + winner.getName() + "!");
        }
    }

    public static Scientist getWinner(Scientist first, Scientist second) {
        int countRobotsFirst = first.getNumberOfRobots();
        int countRobotsSecond = second.getNumberOfRobots();
        if (countRobotsFirst == countRobotsSecond) {
            return null;
        } else {
            return countRobotsFirst > countRobotsSecond ? first : second;
        }
    }
}