package lections.lesson12;

import homework_solution.lesson10.task4.helpers.StringGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Generator {

    private static Room generateRoom() {
        int width = new Random().nextInt(3) + 3;
        int height = new Random().nextInt(3) + 3;
        return new Room(width, height);
    }

    private static Flat generateFlat() {
        int number = new Random().nextInt(1000) + 1;
        List<Room> rooms = new ArrayList<>();
        int roomsAmount = new Random().nextInt(4) + 1;
        for (int i = 0; i < roomsAmount; i++) {
            Room room = generateRoom();
            rooms.add(room);
        }
        return new Flat(number, rooms);
    }

    public static House generateHouse() {
        List<Flat> flats = new ArrayList<>();
        int flatsNumber = new Random().nextInt(3) + 1;
        for (int i = 0; i < flatsNumber; i++) {
            Flat flat = generateFlat();
            flats.add(flat);
        }
        return new House(flats, StringGenerator.generate(20, "abcdefgh"));
    }

}
