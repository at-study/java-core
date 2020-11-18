package lections.lesson14.optional;

import lections.lesson9.animals.Cat;

import java.util.Optional;

public class Application {

    public static void main(String[] args) {
        Cat cat = new Cat();
        // Создание Optional
        Optional<Cat> optionalCat = Optional.of(cat);
        Optional<Cat> optionalNullableCat = Optional.ofNullable(cat);
        Optional<Cat> nullOptionalCat = Optional.empty();

        //Получение значения из Optional
        Cat catFromOptional = optionalCat.get();
        Cat catFromOptional2 = optionalCat.orElse(new Cat());
        Cat catFromOptional3 = optionalCat.orElseGet(() -> new Cat());
        Cat catFromOptional4 = optionalCat.orElseThrow(() -> new RuntimeException("Tried to get null value"));

        //Изменить обертку
        Optional.of("some string").filter(str -> str.length() > 5); // result = Optional.of("some string")
        Optional.of("some string").filter(str -> str.length() < 5); // result = Optional.ofNullable(null)
        Optional.of("some string").map(str -> str.toLowerCase());

        //Операции
        boolean isPresent = Optional.ofNullable("str1").isPresent();
        Optional.ofNullable("str1").ifPresent(str -> System.out.println(str));


    }

}
