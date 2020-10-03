package lections.lesson5;

public class NullSafeApplication {

    public static void main(String[] args) {
        Human human = null;

        int age;
        try {
            human.setAge(10);
            age = human.getAge();
        } catch (NullPointerException npe) {
            human = new Human();
            human.setAge(15);
            age = human.getAge();
        }
        System.out.println(age);
    }

}
