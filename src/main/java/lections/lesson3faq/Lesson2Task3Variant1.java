package lections.lesson3faq;

public class Lesson2Task3Variant1 {

    public static void main(String[] args) {
        Lesson2Task3Variant1 instance = new Lesson2Task3Variant1();
        System.out.println(instance.isPhoneValid("+7(912)532-32-64"));
    }

    boolean isPhoneValid(String phoneCandidate) {
        if (!phoneCandidate.startsWith("+7("))
            return false;
        if (phoneCandidate.charAt(6) != ')')
            return false;
        if (phoneCandidate.charAt(10) != '-')
            return false;
        if (phoneCandidate.charAt(13) != '-')
            return false;
        if (phoneCandidate.length() != 16)
            return false;
        int[] digitIndexes = {3, 4, 5, 7, 8, 9, 11, 12, 14, 15};
        for (int index : digitIndexes) {
            if (!(phoneCandidate.charAt(index) >= '0' && phoneCandidate.charAt(index) <= '9'))
                return false;
        }
        return true;
    }

}
