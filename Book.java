public class Book {
    public String title;
    public String author;
    public double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public static void main(String[] args) {
        Book sach = new Book("Lap trinh Java", "Rekkei Edu", 1500000.0);

        System.out.println("Title: " + sach.title + ", Author: " + sach.author + ", Price: " + sach.price);
    }
}