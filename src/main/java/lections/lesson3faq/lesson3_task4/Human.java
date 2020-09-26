package lections.lesson3faq.lesson3_task4;

import java.util.Arrays;

public class Human {
    Human[] friends;

    void addFriend(Human friend) {
        if (friends == null)
            friends = new Human[1];
        else {
            friends = Arrays.copyOf(friends, friends.length + 1);
        }
        friends[friends.length - 1] = friend;

        boolean isAlreadyFriend = false;
        for (Human human : friends) {
            if (human == friend)
                isAlreadyFriend = true;
        }
    }
}
