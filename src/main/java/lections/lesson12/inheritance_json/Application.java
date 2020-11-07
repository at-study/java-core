package lections.lesson12.inheritance_json;

import com.google.gson.Gson;

public class Application {

    public static void main(String[] args) {
        Cat cat = new Cat("Барсик", 4, 2);
        System.out.println(new Gson().toJson(cat));

    }

}
