public class Car{
    String color;
    String brand;

    //Early Instantiate
    Engine e = new Engine(1200);

    public Car(String color, String brand){
        this.color = color;
        this.brand = brand;
    }
}