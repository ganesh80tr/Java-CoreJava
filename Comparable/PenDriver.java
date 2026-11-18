import java.util.Arrays;

public class PenDriver {
    public static void main(String[] args) {
        Pen p1 = new Pen("montex", "red", 20);
        Pen p2 = new Pen("cello", "red", 30);
        Pen p3 = new Pen("parkar", "red", 79);
        Pen p4 = new Pen("xo", "red", 10);
        Pen p5 = new Pen("trimex", "red", 200);

        Pen[] arr = new Pen[5];

        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;
        arr[3] = p4;
        arr[4] = p5;

        for(Pen p : arr){
            System.out.println(p);
        }

        System.out.println();

        Arrays.sort(arr);

        for(Pen p : arr){
            System.out.println(p);
        }
    }
}
