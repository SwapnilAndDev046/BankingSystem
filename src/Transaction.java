public class Transaction {
    private double balanceAfterTransaction;
    private final long accountNumber;
    private double WithDraw;
    private double Deposit;
    private long TransferTo;//WithDraw or Deposit


    public long getAccountNumber() {
        return accountNumber;
    }

    public Transaction(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Transaction(long accountNumber, double balanceAfterTransaction, double deposit, double withDraw) {
        this.accountNumber = accountNumber;
        this.balanceAfterTransaction = balanceAfterTransaction;
        this.Deposit = deposit;
        this.WithDraw = withDraw;
    }

    public Transaction(long accountNumber, double balanceAfterTransaction, double deposit, long transferTo, double withDraw) {
        this.accountNumber = accountNumber;
        this.balanceAfterTransaction = balanceAfterTransaction;
        this.Deposit = deposit;
        this.TransferTo = transferTo;
        this.WithDraw = withDraw;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "accountNumber=" + accountNumber +
                ", balanceAfterTransaction=" + balanceAfterTransaction +
                ", WithDraw=" + WithDraw +
                ", Deposit=" + Deposit +
                ", TransferTo=" + TransferTo +
                '}';
    }

}
