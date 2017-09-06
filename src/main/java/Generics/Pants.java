package Generics;

public class Pants extends Clohtes implements IFold {

    private boolean folded;

    public Pants(String name, int size, String tag) {
        super.name = name;
        super.size = size;
        super.tag = tag;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public String getTag() {
        return tag;
    }

    @Override
    public void Fold() {
        folded = true;

    }

    @Override
    public void UnFold() {
        folded = false;

    }
}
