package lections.lesson4;

public class CatApplication {

    public static void main(String[] args) {
        Cat barsik = new Cat();
        barsik.setName("Барсик");
        barsik.setAge(3);
        barsik.setWeight(5);

        Cat murzik = new Cat();
        murzik.setName("Мурзик");
        murzik.setWeight(6);

        Cat pushok = new Cat().setName("Пушок").setAge(2).setWeight(4);

        System.out.println();
    }

}
