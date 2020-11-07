package lections.lesson12.cars;

import com.google.gson.Gson;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Application {

    public static void main(String[] args) {
        Wheel[] wheels = {new Wheel(), new Wheel(), new Wheel(), new Wheel()};
        List<Wheel> wheelsList = Arrays.asList(new Wheel(), new Wheel(), new Wheel(), new Wheel());
        Set<Wheel> wheelsSet = new HashSet<>(Arrays.asList(new Wheel(), new Wheel(), new Wheel(), new Wheel()));

        BMW bmw = new BMW(wheelsList);
        Mercedes mercedes = new Mercedes(wheels);
        Ford ford = new Ford(wheelsSet);

        System.out.println(new Gson().toJson(bmw));
        System.out.println(new Gson().toJson(mercedes));
        System.out.println(new Gson().toJson(ford));

        String bmwJson = new Gson().toJson(bmw);
        Mercedes bmwMercedes = new Gson().fromJson(bmwJson, Mercedes.class);

        System.out.println();
    }

}
