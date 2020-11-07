package tests.lesson12;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import lections.lesson12.Flat;
import lections.lesson12.Generator;
import lections.lesson12.House;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class HouseGenerator {

    @Test
    public void houseGeneratorTest() {
        House house = Generator.generateHouse();

        //String json = new Gson.toJson(house);
        String json = new GsonBuilder().setDateFormat("dd.MM.yyyy").create().toJson(house);
        System.out.println(json);
    }

    @Test
    public void flatsGeneratorTest() {
        House house = Generator.generateHouse();
        List<Flat> flats = house.getFlats();

        String json = new Gson().toJson(flats);
        System.out.println(json);
    }

    @Test
    public void houseDeserializationTest() {
        String json = "{\"flats\":[{\"number\":571,\"rooms\":[{\"width\":4,\"height\":5},{\"width\":5,\"height\":4},{\"width\":3,\"height\":5}]},{\"number\":546,\"rooms\":[{\"width\":3,\"height\":4},{\"width\":3,\"height\":3},{\"width\":3,\"height\":5},{\"width\":3,\"height\":5}]}],\"address\":\"ggebddeddbghbdadahah\",\"date\":\"07.11.2020\"}\n";

        //House house = new Gson().fromJson(json, House.class);
        House house = new GsonBuilder().setDateFormat("dd.MM.yyyy").create().fromJson(json, House.class);
        System.out.println();
    }

    @Test
    public void listDeserializationTest() {
        String json = "[{\"number\":305,\"rooms\":[{\"width\":4,\"height\":4},{\"width\":5,\"height\":3},{\"width\":5,\"height\":4},{\"width\":3,\"height\":3}]}]\n";

        //List<Flat> flats = new Gson().fromJson(json, List.class);
        List<Flat> flats = new Gson().fromJson(json, new TypeToken<ArrayList<Flat>>(){}.getType());
        System.out.println();

    }

}
