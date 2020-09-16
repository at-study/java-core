package lections.lesson1;

public class Home {

    Flat flat;

    public static class Flat {

        Room room1 = new Room();
        Room room2 = new Room();

        public static class Room {

            Window window = new Window();
            Door door = new Door();

            public static class Window {
                int count = 2;
                boolean isOpen = false;
            }

            public static class Door {
                boolean isOpen = true;
            }

        }

    }



    public static void main(String[] args) {
        Flat flat = new Flat();

        System.out.println("Дверь открыта: " + flat.room1.door.isOpen);
        System.out.println("Окно открыто: " + flat.room1.window.isOpen);
        System.out.println("У окна " + flat.room1.window.count + " створки");

    }

}
