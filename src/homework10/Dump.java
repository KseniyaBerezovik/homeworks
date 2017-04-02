package homework10;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Dump {
    public static List<RobotPart> damp = new CopyOnWriteArrayList<>();

    static {
        for (int i = 0; i < 20; i++) {
            damp.add(RobotPart.getRandomPath());
        }
    }
}