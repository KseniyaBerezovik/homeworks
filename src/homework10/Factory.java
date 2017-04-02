package homework10;

import java.util.Random;

public class Factory implements Runnable {
    @Override
    public void run() {
        Thread.currentThread().setPriority(Thread.NORM_PRIORITY);
        try {
            Demo.barrier.await();
        } catch (Throwable t) {
            t.printStackTrace();
        }

        for (int i = 0; i < new Random().nextInt(4) + 1; i++) {
            Dump.damp.add(RobotPart.getRandomPath());
        }
    }
}