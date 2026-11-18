package Fastrack;

public class Pair<T, U> {
    T firstValue;
    U secondValue;

    Pair(T firstValue, U secondValue){
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    public void displayPair(){
        System.out.println("firstValue: " + firstValue);
        System.out.println("SecondValue: " + secondValue);
    }
}
