package AuthorAndBook;

public class Author {

    private String _name;
    private String _email;
    private Character _gender;          //Character to char opakowany w obiekt

    public Author(String name, String email, Character gender){
        _name = name;
        _email = email;
        _gender = Character.toLowerCase(gender);
    }

    public String getName() {
        return _name;
    }

    public String getEmail() {
        return _email;
    }

    public void setEmail(String email) {
        _email = email;
    }

    public Character getGender() {
        return _gender;
    }

    @Override
    public String toString() {
        return "Author[name='" + _name + '\'' +
                ", email=" + _email +
                ", gender=" + (_gender=='m'?"Male":"Female") +
                ']';
    }
}
