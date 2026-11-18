public class LibraryApp {
    public static void main(String[] args) {
        Book b1 = new Book(101, "Java Basics", "rahul", 1200);
        Book b2 = new Book(102, "Python basics", "Amit", 800);
        Book b3 = new Book(103, "SQl Fundamentals", "Priya", 1500);

        b1.displayBookDetails();
        b2.displayBookDetails();
        b3.displayBookDetails();

        Book.displayTotalBooks();

        Book b5 = new Book(105, "Naruto", "Ganesh", 1200);
        b5.displayBookDetails();
        System.out.println(b5.isExpensive());
        System.out.println();

        b5.applyDiscount(10);
        System.out.println(b5.price);
        System.out.println();

        b5.updatePrice(1050);
        System.out.println(b5.price);
        System.out.println();

        Book.displayTotalBooks();

    }
}
