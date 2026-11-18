public class Sedan {
    private String brand;
    private String color;
    private int i = 0;
    private Tyre[] tyres = new Tyre[4];

    public Sedan(String brand, String color){
        this.brand = brand;
        this.color = color;
    }

    public void addTyre(double size, String brand){
        if(i >= 4){
            System.out.println("Already has 4 Tyre!");
            return;
        }

        tyres[i] = new Tyre(brand, size);
        i++;
    }


    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public Tyre[] getTyres(){
        return tyres;
    }

    public void setTyres(Tyre[] tyres){
        this.tyres = tyres;
    }

}
