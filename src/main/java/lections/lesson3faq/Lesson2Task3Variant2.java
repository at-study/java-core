package lections.lesson3faq;

public class Lesson2Task3Variant2 {

    public static void main(String[] args) {
        Lesson2Task3Variant2 instance = new Lesson2Task3Variant2();
        System.out.println(instance.isPhoneValid("+7(916)423-73-12"));
    }

    boolean isPhoneValid(String phoneCandidate) {
        String regexp = "^\\+7\\(\\d{3}\\)\\d{3}-\\d{2}-\\d{2}$";
        return phoneCandidate.matches(regexp);
    }

}
