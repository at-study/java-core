package lections.lesson12.model_transient;

import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Application {

    public static void main(String[] args) throws FileNotFoundException {
        Human human = new Gson().fromJson(
                new FileReader("src\\main\\java\\lections\\lesson12\\model_transient\\human.json"),
                Human.class
        );

        System.out.println(human);

        Human petr = new Human("Сидоров", "Петр", 25);
        System.out.println(new Gson().toJson(petr));
    }
}
