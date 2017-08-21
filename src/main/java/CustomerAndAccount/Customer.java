package CustomerAndAccount;

public class Customer {

    private final int ID;
    private String _name;
    private char _gender;

    public Customer(int id, String name, char gender) {
        ID = id;
        _name = name;
        _gender = gender;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return _name;
    }

    public char getGender() {
        return _gender;
    }

    @Override
    public String toString() {
        return _name + "(" + ID + ")";
    }
}
