package AuthorAndBook;

public class Main {

    public static void main(String[] args) {

        Author tolkien = new Author("Tolkien","tolkien@mordor.com",'m');
        System.out.println(tolkien);

        Book book1 = new Book("Hobbit",tolkien,21.99,6);
        Book book2 = new Book("LOTR", tolkien,56);
        Book book3 = new Book("Lewa Ręka Ciemności",new Author("Le Guin","leGuin@gmail.com",'f'),17.49,16 );
        System.out.println(book3);

    }
}
