package Fastrack;

public class ResultDriver {
    public static void main(String args[]){
        Result<Integer> s1 = new Result<Integer>("Ganesh", 88);
        s1.displayResult();

        Result<Double> s2 = new Result<Double>("Sanket", 85.90);
        s2.displayResult();

        Result<String> s3 = new Result<>("Kshitij", "90");
        s3.displayResult();
    }
}
