package lections.lesson12.model2;

import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Application {

    public static void main(String[] args) throws FileNotFoundException {

        SymbolAmountsInformation sai = new Gson().fromJson(
                new FileReader("src\\main\\java\\lections\\lesson12\\model2\\document.json"),
                SymbolAmountsInformation.class
                );

        System.out.println();

    }

}
