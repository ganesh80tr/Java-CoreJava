public class SedanDriver {
    public static void main(String[] args) {
        
        Sedan s1 = new Sedan("Virtus", "Black");

        // Tyre[] tyres = s1.getTyres();

        s1.addTyre(16.0, "CEAT");
        s1.addTyre(16.0, "MRF");
        s1.addTyre(16.0, "CEAT");
        s1.addTyre(16.0, "MRF");
        s1.addTyre(16.0, "MRF");

        Tyre[] tyres = s1.getTyres();

        System.out.println(tyres[0].getBrand());
        System.out.println(tyres[1].getBrand());
        System.out.println(tyres[2].getBrand());
        System.out.println(tyres[3].getBrand());
    }
}   
