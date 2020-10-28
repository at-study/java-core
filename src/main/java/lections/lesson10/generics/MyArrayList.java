package lections.lesson10.generics;

import java.util.ArrayList;

public class MyArrayList<T> extends ArrayList<T> {

    @Override
    public boolean add(T t) {
        System.out.println(t.toString());
        return super.add(t);
    }

    @Override
    public void add(int index, T element) {
        System.out.println(element.toString());
        super.add(index, element);
    }
}
