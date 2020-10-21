package lections.lesson9.chess.chess_entities;

public class Position {
    private char horizontal;
    private char vertical;

    public Position(String position) {
        if (position.length() != 2) throw new IllegalArgumentException();
        horizontal = position.charAt(0);
        vertical = position.charAt(1);
        if (horizontal < 'A' || horizontal > 'H')
            throw new IllegalArgumentException();
        if (vertical < '1' || vertical > '8')
            throw new IllegalArgumentException();
    }

    public Position(char horizontal, char vertical) {
        this.horizontal = horizontal;
        this.vertical = vertical;
    }

    public char getVertical() {
        return vertical;
    }

    public char getHorizontal() {
        return horizontal;
    }

    @Override
    public String toString() {
        return String.valueOf(horizontal) + vertical;
    }

}
