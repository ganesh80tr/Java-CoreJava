public class Driver {

    public static void checkSound(Animal a){
        a.sound();
    }
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        checkSound(a1);
        checkSound(a2);

        Animal a3 = new Persian();
        checkSound(a3);
    }
}
