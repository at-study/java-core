package lections.lesson12.model;

import com.google.gson.Gson;

import java.io.FileReader;
import java.io.IOException;

public class Application {

    public static void main(String[] args) throws IOException {

        WidgetInformation widgetInfo = new Gson().fromJson(new FileReader("src\\main\\java\\lections\\lesson12\\model\\widget.json"), WidgetInformation.class);

        System.out.println();
    }

}
