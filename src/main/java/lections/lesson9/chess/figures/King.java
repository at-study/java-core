package lections.lesson9.chess.figures;

import lections.lesson9.chess.chess_entities.Position;
import lections.lesson9.chess.helpers.Chess;

import java.util.HashSet;
import java.util.Set;

public class King extends Figure {

    public King(Position position) {
        super("Король", position);
    }

    @Override
    public Set<Position> getAvailableMoves() {
        Set<Position> allPositions = Chess.getAll();
        Set<Position> availableMoves = new HashSet<>();
        for (Position candidate : allPositions)
            if (isMoveAvailable(position, candidate))
                availableMoves.add(candidate);
        return availableMoves;
    }

    private boolean isMoveAvailable(Position figurePosition, Position candidate) {
        int dx = Math.abs(figurePosition.getHorizontal() - candidate.getHorizontal());
        int dy = Math.abs(figurePosition.getVertical() - candidate.getVertical());
        if (dx == 0 && dy == 1) return true;
        if (dx == 1 && dy == 0) return true;
        if (dx == 1 && dy == 1) return true;
        return false;
    }
}
