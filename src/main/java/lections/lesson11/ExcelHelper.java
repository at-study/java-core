package lections.lesson11;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExcelHelper {

    public static List<Human> getHumansFromExcel(String path) throws IOException {
        Workbook workbook = new XSSFWorkbook(new FileInputStream(path));
        Sheet sheet = workbook.getSheet("Лист1");
        int rowCount = sheet.getLastRowNum() + 1;
        List<Human> humans = new ArrayList<>();
        for (int i = 1; i < rowCount; i++) {
            Row row = sheet.getRow(i);
            String lastName = row.getCell(0).getStringCellValue();
            String firstName = row.getCell(1).getStringCellValue();
            Integer age = (int) row.getCell(2).getNumericCellValue();
            Human human = new Human(lastName, firstName, age);
            humans.add(human);
        }
        workbook.close();
        return humans;
    }

}
