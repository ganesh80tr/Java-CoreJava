package Fastrack;

public class BoxDriver {
    public static void main(String[] args) {
        Box<String> b = new Box<String> ("abc");
        System.out.println(b);

        String[] arr = {"Sheela" , "Shakila", "Munni", "Shilpa"};
        b.print(arr); 

        Box<Integer> b1 = new Box<Integer>(10);
        System.out.println(b1);
    }
}
 