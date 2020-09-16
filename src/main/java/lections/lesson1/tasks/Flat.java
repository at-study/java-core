package lections.lesson1.tasks;

public class Flat {
    int room1x = 4;
    int room1y = 5;
    int room2x = 4;
    int room2y = 4;
    int room3x = 8;
    int room3y = 3;

    int squareMeterCost = 200000;

    int getFlatCost() {
        int square = getRoomSquare(room1x, room1y) + getRoomSquare(room2x, room2y) + getRoomSquare(room3x, room3y);
        return square * squareMeterCost;
    }

    int getRoomSquare(int width, int height) {
        return width * height;
    }

}
