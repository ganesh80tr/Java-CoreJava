package NonStatic;

public class BookDriver {
    public static void main(String[] args) {
        Book b1 = new Book();

        System.out.println(b1.id);
        System.out.println(b1.title);
        System.out.println(b1.author);
        System.out.println(b1.price);
        System.out.println(b1.pages);

        b1.id = 1;
        b1.title = "Sheela ki Jawani";
        b1.author = "Atharva Deshmukh";
        b1.price = 1000.00;
        b1.pages = 300;

        System.out.println(b1.id);
        System.out.println(b1.title);
        System.out.println(b1.author);
        System.out.println(b1.price);
        System.out.println(b1.pages);

        Book b2 = new Book();

        b2.id = 2;
        b2.title = "Titanic";
        b2.author = "James Bond";
        b2.price = 2000;
        b2.pages = 200;

        System.out.println(b2.id);
        System.out.println(b2.title);
        System.out.println(b2.author);
        System.out.println(b2.price);
        System.out.println(b2.pages);
    }
}
