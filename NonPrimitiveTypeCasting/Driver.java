public class Driver {
    public static void main(String[] args) {
        Animal a1 = new Rotweller();

        Rotweller r1 = (Rotweller) a1; //DownCasting
        System.out.println(r1.r);

        Animal a2 = new Dog();

        if(a2 instanceof Rotweller){
            Rotweller r2 = (Rotweller) a2; //Downcasting
            System.out.println(r2.r);
        }
        else{
            System.out.println("You can't use rotweller member!");
        }
    }
}
