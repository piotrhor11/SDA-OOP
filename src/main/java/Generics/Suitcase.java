package Generics;

public class Suitcase<T extends Clohtes & IFold> {

    private T _thing;

    public T getThing() {
        return _thing;
    }

    public void setThing(T thing) {
        _thing = thing;
    }


    public String getName() {
        return _thing.getName();
    }


    public int getSize() {
        return _thing.getSize();
    }


    public String getTag() {
        return _thing.getTag();
    }

}
