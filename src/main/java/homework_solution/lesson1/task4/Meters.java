package homework_solution.lesson1.task4;

public class Meters {

    public static void main(String[] args) {
        Meters meters = new Meters();
        System.out.println(meters.getMeters(115));
        System.out.println(meters.getMeters(800));
        System.out.println(meters.getMeters(278));
    }

    int getMeters(int centimeters) {
        return centimeters / 100;
    }
}
