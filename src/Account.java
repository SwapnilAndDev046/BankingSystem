

public class Account {
    private double balance;
//
    public Account(String accountHolder,long AccountNumber) {
    }


    void Withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance = balance - amount;
        } else if (balance < amount)
            throw new LowBalance("Insufficient Balance");
        else
            throw new InvalidInput("Invalid Input");
    }

    void Deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
        } else
            throw new InvalidInput("Invalid Input");
    }



    public double getBalance() {
        return balance;
    }
}
