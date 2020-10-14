package lections.lesson7.mynewlist;

import java.util.ArrayList;

public class MyArrayList<TYPE> extends ArrayList<TYPE> {

    @Override
    public boolean add(TYPE t) {
        System.out.println(t.toString());
        return super.add(t);
    }

    @Override
    public TYPE get(int index) {
        TYPE t = super.get(index);
        System.out.println(t.toString());
        return t;
    }

}
