package lections.lesson8;

import java.util.ArrayList;
import java.util.List;

public class TaskApplication {

    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            Task task = new Task();
            tasks.add(task);
        }

        for (Task task : tasks) {
            Thread thread = new Thread(task);
            thread.start();
        }

    }
}
