package lections.lesson4.town;

public class MakeTown {

    public static void main(String[] args) {
        Street street = new Street();
        street.setHouses(new House[]{new House()});
        street.houses[0].flats = new Flat[]{new Flat()};
        street.houses[0].flats[0].rooms = new Room[]{new Room()};


        street.houses[0].flats[0].rooms[0].setX(5).setY(5);

    }

}
