package AuthorAndBook;

public class Book {

    private String _name;
    private Author _author;
    private double _price;
    private int _qty = 0;

    public Book(String name, Author author, double price){
        _name = name;                                       //Pomijamy "this.", bo zmienne są jednoznaczne
        _author = author;
        _price = price;
    }

    public Book(String name, Author author, double price, int qty){
        _name = name;
        _author = author;
        _price = price;
        _qty = qty;
    }

    public String getName() {
        return _name;
    }

    public Author getAuthor() {
        return _author;
    }

    public double getPrice() {
        return _price;
    }

    public void setPrice(double price) {
        _price = price;
    }

    public int getQty() {
        return _qty;
    }

    public void setQty(int qty) {
        _qty = qty;
    }

    @Override
    public String toString() {
        return "Book[name=" + _name +
                ", "+ _author +                           //Korzystamy z toString klasy Author
                ", price=" + _price +
                ", qty=" + _qty +
                ']';
    }
}
