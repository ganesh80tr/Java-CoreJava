public class BankAccount {
    String accountHolderName;
    long accountNumber;
    double balance;
    String bankName;
    String accountType;

    {
        bankName = "SBI";
    }

    public BankAccount(String accountHolderName, long accountNumber, double balance, String accountType){
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        // this.bankName = bankName;
        this.accountType = accountType;
    }

    public void displayAccountDetails(){
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + "$" + balance);
        System.out.println();
    }

    public void deposit(double amount){
        if(amount > 0){
            balance = balance + amount;
            System.out.println("$" + amount + " Deposited Successfully!");
            System.out.println("Your Current Balance: " + "$" + balance);
            System.out.println();
        }
        else{
            System.out.println("Amount you are trying to deposit is invalid!");
            System.out.println();
        }
    }

    public void withdraw(double amount){
        if(amount <= 0){
            System.out.println("Invalid Amount!");
            System.out.println();
        }
        else if(balance >= amount){
            balance = balance - amount;
            System.out.println("$" + amount + " Withdraw Successfully!");
            System.out.println("Your Current Balance: " + "$" + balance);
            System.out.println();
        }
        else{
            System.out.println("Insufficient Balance!");
            System.out.println();
        }
    }


}
