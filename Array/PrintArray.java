package Array;

public class PrintArray {
    public static void print(int a[]){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + 10 + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        print(arr);

        int num[] = {23, 45, 43, 87, 90, 83, 56};
        print(num);
    }
}
