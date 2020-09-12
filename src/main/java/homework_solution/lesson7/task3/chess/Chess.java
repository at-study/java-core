package homework_solution.lesson7.task3.chess;

import java.util.HashSet;
import java.util.Set;

public class Chess {

    public static Set<Position> allField() {
        Set<Position> fields = new HashSet<>();
        for (Position.Horizontal horizontal : Position.Horizontal.values()) {
            for (int j = 1; j <= 8; j++) {
                fields.add(new Position(horizontal.name() + j));
            }
        }
        return fields;
    }
}
