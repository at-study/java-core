package tests.lesson11;

import lections.lesson11.ExcelHelper;
import lections.lesson11.Human;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

public class GetHumansFromExcelTests {

    @Test
    public void getHumansPositiveTest() throws IOException {
        List<Human> humans = ExcelHelper.getHumansFromExcel("C:\\Users\\George\\Desktop\\clients.xlsx");

        Assertions.assertEquals(2, humans.size());

        Assertions.assertEquals("Иванов", humans.get(0).getLastName());
        Assertions.assertEquals("Иван", humans.get(0).getFirstName());
        Assertions.assertEquals(18, humans.get(0).getAge());

        Assertions.assertEquals("Петров", humans.get(1).getLastName());
        Assertions.assertEquals("Петр", humans.get(1).getFirstName());
        Assertions.assertEquals(25, humans.get(1).getAge());

    }

}
