package Fastrack;

public class Box<T> {
    T a;

    Box(T a){
        this.a = a;
    }

    public void print(T[] arr){
        for(T n: arr){
            System.out.println(n);
        }
    }

    public String toString(){
        return ""+a;
    }
}
