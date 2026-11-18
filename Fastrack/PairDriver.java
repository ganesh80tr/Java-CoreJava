package Fastrack;

public class PairDriver {
    public static void main(String[] args) {
        Pair<String, Integer> p1 = new Pair<String,Integer>("Ganesh", 88);
        p1.displayPair();

        Pair<Integer, String> p2 = new Pair<Integer,String>(101, "Sanket");
        p2.displayPair();
    }
}
