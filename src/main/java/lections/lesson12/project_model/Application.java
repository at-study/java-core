package lections.lesson12.project_model;

import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Application {

    public static void main(String[] args) throws FileNotFoundException {

        Project project = new Gson().fromJson(
                new FileReader("src\\main\\java\\homework_task\\lesson12\\task3\\project.json"),
                Project.class
        );

    }

}
