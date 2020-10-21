package lections.lesson9.chess;

import lections.lesson9.chess.chess_entities.Position;
import lections.lesson9.chess.figures.Figure;
import lections.lesson9.chess.figures.King;

import java.util.Set;

public class Application {

    public static void main(String[] args) {
        Position position = new Position("A1");

        Figure figure = new King(position);

        Set<Position> kingAvailableMoves = figure.getAvailableMoves();
        System.out.println();

    }

}
