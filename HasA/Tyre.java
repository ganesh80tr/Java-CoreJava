public class Tyre {
    private String brand;
    private double size;

    public Tyre(String brand, double size){
        this.brand = brand;
        this.size = size;
    }

    public double getSize(){
        return size;
    }

    public void setSize(double size){
        this.size = size;
    }

    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }
}
