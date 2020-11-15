package lections.lesson13.lambdas;

public class Application2 {

    @FunctionalInterface
    public interface StringOperation {

        Boolean process(String s1, String s2);

    }

    public static void main(String[] args) {
        StringOperation operation = (str1, str2) -> str1.contains(str2);
        StringOperation operation2 = (s1, s2) -> s2.startsWith(s1);

        Boolean result = operation.process("Строка", "тро");
        System.out.println(result);
    }

}
