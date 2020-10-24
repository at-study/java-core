package lections.lesson9faq;

public class ListApplication {

    private static class Animal {

    }

    private static class HomeAnimal extends Animal {
        void voice() {

        }
    }

    private static class Dog extends HomeAnimal {
        @Override
        void voice() {

        }
    }

    public static void getVoice(HomeAnimal animal) {
        animal.voice();
    }

    public static void main(String[] args) {
        /*
        List<Animal> dogs = new ArrayList<>();
        Animal dog1 = new Dog();
        HomeAnimal dog2 = new Dog();
        Dog dog3 = new Dog();

        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);

        for (Object a1: dogs)
            ((HomeAnimal) a1).voice();

         */
        Object dog1 = new Dog();
        Animal dog2 = new Dog();
        HomeAnimal dog3 = new Dog();
        Dog dog4 = new Dog();

        getVoice((HomeAnimal) dog1);
        getVoice(dog3);
        getVoice(dog4);

    }
}
