package lections.lesson10.task1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {

    public static void main(String[] args) throws IOException {

        List<Cat> catsFromFile = getCatsFromFile("src\\main\\java\\lections\\lesson10\\task1\\cats.txt");


        List<Cat> cats = Arrays.asList(new Cat(), new Cat(), new Cat(), new Cat(), new Cat());

        File file = new File("src\\main\\java\\lections\\lesson10\\task1\\cats.png");
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));

        for (Cat cat : cats) {
            writer.write(cat + System.lineSeparator()); //  Windows: \r\n    *nix:  \n
        }

        writer.flush();
        writer.close();

    }

    public static List<Cat> getCatsFromFile(String path) throws IOException {
        List<String> content = Files.readAllLines(Paths.get(path));
        List<Cat> cats = new ArrayList<>();
        for (String catInformation : content) {
            Cat cat = new Cat();
            String name = catInformation.split("'")[1];
            int age = Integer.parseInt(catInformation.split("(age=)|}")[1]);
            cat.setName(name);
            cat.setAge(age);
            cats.add(cat);
        }
        return cats;
    }

}
