public class DebitCard implements Payment{
    @Override 
    public void pay(){
        System.out.println("Payment done by Debit card");
    }
}
