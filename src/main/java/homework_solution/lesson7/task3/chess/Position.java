package homework_solution.lesson7.task3.chess;

public class Position {
    enum Horizontal {
        A, B, C, D, E, F, G, H;

        int getPosition() {
            return ordinal() + 1;
        }

        static Horizontal byPosition(int position) {
            for (Horizontal horizontal : Horizontal.values()) {
                if (horizontal.ordinal() == position - 1)
                    return horizontal;
            }
            return null;
        }
    }

    private int horizontal;
    private int vertical;

    public Position(String position) {
        this.horizontal = Horizontal.valueOf(position.split("")[0]).getPosition();
        this.vertical = Integer.parseInt(position.split("")[1]);
    }

    public int getHorizontal() {
        return horizontal;
    }

    public int getVertical() {
        return vertical;
    }

    public String getPosition() {
        String letterHorizontal = Horizontal.byPosition(horizontal).name();
        return letterHorizontal + vertical;
    }
}
