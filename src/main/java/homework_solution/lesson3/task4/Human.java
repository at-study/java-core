package homework_solution.lesson3.task4;

public class Human {
    String name;
    Human[] friends = new Human[3];

    Human(String name) {
        this.name = name;
    }

    /**
     * Добавляет друга человеку. Вызывает аналогичный метод добавления себя у добавленного друга
     *
     * @param friend - человек, с которым надо подружиться :)
     */
    void addFriend(Human friend) {
        int index = 0;
        while (friends[index] != null) {
            if (friends[index] == friend) return;
            index++;
        }
        friends[index] = friend;
        friend.addFriend(this);
    }
}
