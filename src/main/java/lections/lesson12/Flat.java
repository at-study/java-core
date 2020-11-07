package lections.lesson12;

import java.util.List;

public class Flat {

    private Integer number;
    private List<Room> rooms;

    public Flat(Integer number, List<Room> rooms) {
        this.number = number;
        this.rooms = rooms;
    }

    public Integer getNumber() {
        return number;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flat flat = (Flat) o;

        if (number != null ? !number.equals(flat.number) : flat.number != null) return false;
        return rooms != null ? rooms.equals(flat.rooms) : flat.rooms == null;
    }

    @Override
    public int hashCode() {
        int result = number != null ? number.hashCode() : 0;
        result = 31 * result + (rooms != null ? rooms.hashCode() : 0);
        return result;
    }
}
