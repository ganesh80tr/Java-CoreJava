public class PaymentDriver {
    public static void main(String[] args) {
        Payment p1 = new UPI();
        p1.pay();

        Payment p2 = new DebitCard();
        p2.pay();

        Payment p3 = new NetBanking();
        p3.pay();
    }
}