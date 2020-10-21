package lections.lesson8;

public class Task implements Runnable {
    private int index;
    static int count = 0;


    public Task() {
        index = count++;
    }

    @Override
    public void run() {
        System.out.println("Текущий индекс задачи: " + index);
    }


}
