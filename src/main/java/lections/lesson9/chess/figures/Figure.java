package lections.lesson9.chess.figures;

import lections.lesson9.chess.chess_entities.Color;
import lections.lesson9.chess.chess_entities.Position;

import java.util.Set;

public abstract class Figure {

    protected String name;
    protected Color color;
    protected Position position;

    public Figure(String name, Color color, Position position) {
        this.name = name;
        this.color = color;
        this.position = position;
    }

    public Figure(String name, Position position) {
        this.name = name;
        this.position = position;
    }

    public abstract Set<Position> getAvailableMoves();

}
