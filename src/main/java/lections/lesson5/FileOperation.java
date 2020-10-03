package lections.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;

public class FileOperation {

    public static void main(String[] args) throws IOException {
        while (true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String filePath = reader.readLine();
            try {
                for (String line : Files.readAllLines(Paths.get(filePath)))
                    System.out.println(line);
            } catch (NoSuchFileException noFileException) {
                System.out.println(noFileException.getMessage());
            }
        }
    }
}
