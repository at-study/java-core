package lections.lesson10.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Application {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src\\main\\java\\lections\\lesson10\\files\\Application.java");

        List<String> content = Files.readAllLines(path);
        for (String string: content)
            System.out.println(string);



    }

}
