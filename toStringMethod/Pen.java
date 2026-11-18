public class Pen {
    String color;
    String brand;
    double price;

    public Pen(String color, String brand, double price){
        this.color = color;
        this.brand = brand;
        this.price = price;
    }

    @Override 
    public String toString(){
        return "{" + color + ", " + brand + ", " + price + "}";
    }

    @Override 
    public boolean equals(Object o){
        Pen p = (Pen)o;
        return color.equals(p.color) && brand.equals(p.brand) && price == p.price;
    }
}
