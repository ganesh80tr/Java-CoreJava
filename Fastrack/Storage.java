package Fastrack;

public class Storage<T> {
    T value;

    public void store(T value){
        this.value = value;
    }

    public T retrieve(){
        return value;
    }
}
