package Fastrack;

public class StorageDriver {

    public static void main(String[] args) {

        Storage<Integer> s1 = new Storage<>();
        s1.store(100);

        Storage<String> s2 = new Storage<>();
        s2.store("Ganesh");

        Storage<Double> s3 = new Storage<>();
        s3.store(85.90);

        System.out.println(s1.retrieve());
        System.out.println(s2.retrieve());
        System.out.println(s3.retrieve());
    }
}