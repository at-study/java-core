package lections.lesson5;

public class HumanApplication {

    public static void main(String[] args) {
        Human human = new Human();


        try {
            human.setAge(-5);
            human.setAge(-1);
        } catch (NullPointerException npe) {
            System.out.println("Illegal Argument Exception");
        } catch (IllegalArgumentException exception) {
            System.out.println("Null Pointer Exception");
        } catch (RuntimeException rte) {
            System.out.println("Runtime Exception");
        }
    }

}
