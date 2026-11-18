public class ABDriver {
    public static void main(String[] args) {
        B b1 = new B();

        System.out.println(b1.toString()); //Object class member 
        System.out.println(b1.a); //A class member
        System.out.println(b1.c); //B class member

        A a1 = b1; //Upcasting - Implicitly
        System.out.println(a1.toString()); //Object class member 
        System.out.println(a1.a); //A class member

        Object o1 = a1;
        System.out.println(o1.toString());    
        
        Object o2 = (Object) a1; //Upcasting - explicitly
        System.out.println(o2.toString());

        A a2 = new A();
        Object o3 = a2; //Upcasting

        A a3 = new B(); //Upcasting
        System.out.println(a3.b);

    }
}