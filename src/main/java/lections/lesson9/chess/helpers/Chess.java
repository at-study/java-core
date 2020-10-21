package lections.lesson9.chess.helpers;

import lections.lesson9.chess.chess_entities.Position;

import java.util.HashSet;
import java.util.Set;

public class Chess {

    public static Set<Position> getAll() {
        Set<Position> allMoves = new HashSet<>();
        for (char h = 'A'; h <= 'H'; h++)
            for (char v = '1'; v <= '8'; v++) {
                Position position = new Position(h, v);
                allMoves.add(position);
            }
        return allMoves;
    }
}
