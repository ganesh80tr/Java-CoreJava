public class Book {
    static int totalBooks = 0;

    {
        totalBooks = totalBooks + 1;
    }

    int bookId;
    String title;
    String author;
    double price;

    public Book(int bookId, String title, String author, double price){
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
        // totalBooks++; //To increase Book count
    }

    public Book(int bookId, String title){
        this.bookId = bookId;
        this.title = title;
        // totalBooks++; //To increase Book count
    }

    public void displayBookDetails(){
        System.out.println("Book Id: " + bookId);
        System.out.println("Book Title: " + title);
        System.out.println("Author Name: " + author);
        System.out.println("Price: " + price);
        System.out.println();
    }

    public void applyDiscount(double percent){
        double discountPrice = (price * percent)/100;
        price = price - discountPrice;
        System.out.println("Price after Discount: " + price);
        System.out.println();
    }

    public boolean isExpensive(){
        if(price > 1000){
            return true;
        }

        return false;
    }

    public static void displayTotalBooks(){
        System.out.println("Total Books: " + totalBooks);
        System.out.println();
    }

    public void updatePrice(double newPrice){
        this.price = newPrice;
    }

    public void displayBookCategory() {
        if (price < 500) {
            System.out.println("Budget Book");
        } else if (price <= 1000) {
            System.out.println("Regular Book");
        } else {
            System.out.println("Premium Book");
        }
    }

}
