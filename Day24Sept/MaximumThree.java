package Day24Sept;

public class MaximumThree {
    public static int max(int a, int b, int c){
        if(a > b){
            if(a > c){
                return a;
            }
            else{
                return c;
            }
        }
        else{
            if(b > c){
                return b;
            }
            else{
                return c;
            }
        }
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 88;
        int c = 60;

        System.out.println(max(a, b, c));
    }
}
