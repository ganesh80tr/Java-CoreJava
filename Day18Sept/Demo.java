package Day18Sept;

public class Demo {
    //Static method - belongs to class
    public static void test(){
        System.out.println("Static test");
    }

    //Non static method - belongs to object
    public void task(){
        System.out.println("Non Static task");
    }

    //Main method - belongs to class - JVM calls it without creating object
    public static void main(String args[]){
        System.out.println("Demo main start");
        
        //Calling static method
        test(); 

        //Creating object of Demo class
        Demo d = new Demo();
        //Calling non static method using object
        d.task();
        
        System.out.println("Demo main end");
    }
}
