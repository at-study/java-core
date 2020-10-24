package lections.lesson9faq;

public class Application {

    public static void main(String[] args) {
        Passport passport1 = new Passport("1234", "567890");
        Passport passport2 = new Passport("1234", "567890");

        System.out.println(passport1.hashCode());
        System.out.println(passport2.hashCode());

        User user1 = new User(1, "login1", "password1");
        User user2 = new User(1, "login1", "passwrd2");

        System.out.println(user1.equals(user2));
        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());

    }
}
