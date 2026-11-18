public class Pen implements Comparable{
    String brand;
    String color;
    int price;

    public Pen(String brand, String color, int price){
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    @Override
    public int compareTo(Object o){
        Pen p = (Pen)o;
        return this.price - p.price;
    }

    @Override
    public String toString(){
        return "[ Brand: " + this.brand + ", Color: " + this.color + ", Price: " + this.price + " ]";
    }
}
