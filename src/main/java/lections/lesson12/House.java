package lections.lesson12;

import java.util.Date;
import java.util.List;

public class House {

    private List<Flat> flats;
    private String address;
    private Date date = new Date();

    public House(List<Flat> flats, String address) {
        this.flats = flats;
        this.address = address;
    }

    public List<Flat> getFlats() {
        return flats;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        House house = (House) o;

        if (flats != null ? !flats.equals(house.flats) : house.flats != null) return false;
        return address != null ? address.equals(house.address) : house.address == null;
    }

    @Override
    public int hashCode() {
        int result = flats != null ? flats.hashCode() : 0;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        return result;
    }
}
