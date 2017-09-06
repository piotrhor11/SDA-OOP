package Generics;

import java.util.ArrayList;
import java.util.List;

public class FruitBasket<T extends IFruit> {

    private ArrayList<T> things = new ArrayList<>();

    public List<T> getThings() {
        return things;
    }

    public void addThing(T thing) {
        things.add(thing);
    }

}
