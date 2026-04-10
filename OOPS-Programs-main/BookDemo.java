class Book {

    String title;
    String author;
    double price;

    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    void display() {
        System.out.println(title + " " + author + " " + price);
    }
}

public class BookDemo {
    public static void main(String[] args) {

        Book books[] = {
            new Book("Java", "James Gosling", 500),
            new Book("C Programming", "Dennis Ritchie", 400),
            new Book("Python", "Guido", 450)
        };

        for (Book b : books) {
            b.display();
        }
    }
}