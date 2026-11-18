package MovieTicketBookingSystem;

public class Customer {
    String customerName;
    int age;

    public Customer(String customerName, int age){
        this.customerName = customerName;
        this.age = age;
    }

    public void displayCustomerDetails(){
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer Age: " + age);
    }
}
