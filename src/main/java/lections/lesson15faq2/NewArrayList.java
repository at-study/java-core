package lections.lesson15faq2;

import java.util.ArrayList;

public class NewArrayList<T extends Cat> extends ArrayList<T> {

    public <V extends Cat> V getChildCat() {
        return (V) new Cat.ChildCat();
    }

}
