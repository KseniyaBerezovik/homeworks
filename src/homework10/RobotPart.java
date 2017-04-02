package homework10;

import java.util.Random;

public enum RobotPart {
    HEAD,
    BOBY,
    LEFT_HAND,
    RIGHT_HAND,
    LEFT_LEG,
    RIGHT_LEG,
    CPU,
    RAM,
    HDD;

    public static RobotPart getRandomPath() {
        RobotPart[] parts = RobotPart.values();
        return parts[new Random().nextInt(parts.length)];
    }
}