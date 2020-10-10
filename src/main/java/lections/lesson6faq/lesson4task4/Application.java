package lections.lesson6faq.lesson4task4;

public class Application {

    public static void main(String[] args) {
        Passport passport = new Passport().setNumber("123456").setSeries("1234");
        Passport notUniquePassport = new Passport().setSeries("1234").setNumber("123456");

        Human human = new Human().setAge(15).setFirstName("FirstName").setLastName("LastName").setPassport(passport);
        Human human2 = new Human().setAge(15).setFirstName("FirstName").setLastName("LastName").setPassport(notUniquePassport);
        System.out.println();


    }
}
