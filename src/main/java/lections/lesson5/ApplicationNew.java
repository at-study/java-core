package lections.lesson5;

public class ApplicationNew {

    public static void main(String[] args) {
        try {
            // Какой-то блок кода
        } catch (NumberFormatException nfe) {

        } catch (ArrayIndexOutOfBoundsException aioob) {

        } catch (IllegalArgumentException | IndexOutOfBoundsException exception) {
            System.out.println("Возникло исключение " + exception.getMessage());
        }
}

}
