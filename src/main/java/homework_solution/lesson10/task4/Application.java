package homework_solution.lesson10.task4;

import homework_solution.lesson10.task4.model.CashDocument;
import homework_solution.lesson10.task4.model.SalaryDocument;

import java.io.IOException;

public class Application {

    public static void main(String[] args) throws IOException {
        new SalaryDocument().generate().save();
        new CashDocument().generate().save();
    }

}
