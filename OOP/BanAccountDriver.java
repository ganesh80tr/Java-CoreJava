public class BanAccountDriver {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Ganesh Tiwari", 19750100033396l, 100000, "Saving");
        b1.displayAccountDetails();
        // b1.deposit(-1);
        b1.deposit(5000);
        b1.withdraw(2000);
        // b1.withdraw(-1); // Invalid Amount!
        // b1.withdraw(960000); Insufficient Balance!
        b1.deposit(7000);
    }
}
