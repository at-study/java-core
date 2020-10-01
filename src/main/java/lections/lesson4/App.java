package lections.lesson4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class App {

    public static void main(String[] args) throws ParseException {
        Human human = new Human();
        human.setAge(15);
        human.setAge(-18); // Не установит отрицательное значение
        human.setAge(167);

        System.out.println(human.getAge());

        long date = 900_000_000_000L;
        Date settedDate = new Date(date); // new Date(long value) - устанавливает дату значением value - количество миллисекунд с 1 января 1970 года

        // SimpleDateFormat - класс для работы с датами/строками
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        Date date1 = sdf.parse("29.09.2020"); // Преобразование (парсинг) строки в дату
        Date date2 = sdf.parse("30.09.2020"); // Преобразование (парсинг) строки в дату

        human.setBirthDate(new Date()); // new Date() - конструктор без параметров устанавливает дату значением - текущим временем

        SimpleDateFormat sdfAmerican = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        Date humanDate = human.getBirthDate();
        String formattedDate = sdfAmerican.format(humanDate); // Преобразование (формат) даты в строку
        System.out.println(formattedDate);

        // Вычисление количества миллисекунд с определенного времени (с 1 января 1970 года)
        long start = 0L;
        long current = new Date().getTime();
        System.out.println(current - start);

        // Вычисление времени операции:
        long before = new Date().getTime();
        Human[] humans = new Human[1000000];
        for (int i = 0; i < humans.length; i++) {
            humans[i] = new Human();
        }
        long after = new Date().getTime();
        System.out.printf("Time taken: %d ms%n", after - before);

        // Подсчет количества секунд в сутках
        long now = date1.getTime();
        long tomorrow = date2.getTime();
        System.out.println("Количество секунд в 1 дне: " + (tomorrow - now) / 1000);


    }
}
