package lections.lesson6.maps;


import lections.lesson6.enums.InternationalDayOfWeek;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class Application {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(1, "единица");
        map.put(0, "два");

        String value = map.get(2);

        boolean containsKey = map.containsKey(3);
        boolean containsValue = map.containsValue("два");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        map.entrySet(); // Возвращает Set пар <ключ, значение> из мапы
        map.keySet(); // Возвращает Set ключей из мапы
        map.values(); // Возвращает коллекцию значений

        for (Integer key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }

        String deletedValue = map.remove(3);
        map.remove(1, "один");

        String valueBefore = map.put(5, "пять");
        String valueAfter = map.put(5, "новая пять"); // map.put возвращает предыдущее значение, которое было до записи текущего.

        String valueNull = map.get(10);

        System.out.println(deletedValue);


        Map<String, String> stringMap = new HashMap<>();
        Map<String, Integer> strToIntMap = new HashMap<>();
        Map<Integer, Integer> intToIntMap = new HashMap<>();

        int primitiveX = 3;
        Integer x = primitiveX;
        Long l = 5L;
        Double dbl = 4.2d;
        Boolean bool = true;

        Map<Boolean, String> boolMap = new HashMap<>();
        boolMap.put(true, "true");
        boolMap.put(false, "false");
        boolMap.put(null, "null");
        System.out.println(boolMap.get(null));

        int[] ints = new int[5];
        System.out.println();

        Map<InternationalDayOfWeek, String> days = new TreeMap<>();
        days.put(InternationalDayOfWeek.MONDAY, "Понедельник");
        days.put(InternationalDayOfWeek.TUESDAY, "Вторник");
        days.put(InternationalDayOfWeek.WEDNESDAY, "Среда");
        days.put(InternationalDayOfWeek.WEDNESDAY, "Четверг");

        System.out.println();

    }

}
