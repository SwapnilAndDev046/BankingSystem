//run this file
import java.util.*;

import static java.lang.Math.round;

public class BankSystem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<Long, Account> bank = new HashMap<>();
        List<Transaction> History = new ArrayList<>();
        int n;
        do {
            System.out.print("""
                    
                    1.Create account
                    2.Deposit
                    3.Withdraw
                    4.View balance
                    5.Transaction history
                    6.Tranfer Money
                    Enter what you want:""");

            n = in.nextInt();

            switch (n) {
                case 1:
                    System.out.print("Enter your details carefully!!\n");
                    System.out.print("Enter you firstname: ");
                    String name = in.next();
                    System.out.print("Enter your lastName:");
                    String lastName = in.next();
                    Random rand = new Random();
                    double randDouble = rand.nextDouble();
                    long accountNum = round(Math.pow(10, 12) * randDouble);
                    bank.put(accountNum, new Account(name+" "+lastName, accountNum));
                    History.add(new Transaction(accountNum));
                    System.out.print("************************************ you have new account here congratulations!!**************************************************\n" + "***************************************** you have account number here: " + accountNum + "   *********************************************");
                    break;
                case 2:
                    System.out.print("Enter your Account Number Please: ");
                    long AccountNum2 = in.nextLong();
                    int count = 0;
                    for (Map.Entry<Long, Account> i : bank.entrySet()) {
                        if (AccountNum2 == i.getKey()) {
                            System.out.print("Enter the Amount: ");
                            double amount = in.nextDouble();
                            i.getValue().Deposit(amount);
                            History.add(new Transaction(AccountNum2, i.getValue().getBalance(), amount, 0));
                            System.out.print("************************* Deposited successfully!! ***********************");
                            count++;
                            break;
                        }
                    }
                    if (count == 0)
                        throw new AccountNumberNotFound("*************************** Account Not Found!! *******************");
                    break;
                case 3:
                    System.out.print("Enter your Account Number Please: ");
                    long AccountNum3 = in.nextLong();
                    count = 0;
                    for (Map.Entry<Long, Account> i : bank.entrySet()) {
                        if (AccountNum3 == i.getKey()) {
                            System.out.print("Enter the Amount: ");
                            double amount = in.nextDouble();
                            i.getValue().Withdraw(amount);
                            History.add(new Transaction(AccountNum3, i.getValue().getBalance(), 0, amount));
                            System.out.print("****************************** Withdrawal completed successfully!! **************************");
                            count++;
                            break;
                        }
                    }
                    if (count == 0)
                        throw new AccountNumberNotFound("********************** Account Not found Sorry!! ************************");
                    break;
                case 4:
                    System.out.print("Enter your Account Number Please: ");
                    long AccountNum4 = in.nextLong();
                    count = 0;
                    for (Map.Entry<Long, Account> i : bank.entrySet()) {
                        if (AccountNum4 == i.getKey()) {
                            System.out.print("*************************** Your balance is: " + i.getValue().getBalance() + "  *****************************");
                            count++;
                            break;
                        }
                    }
                    if (count == 0)
                        throw new AccountNumberNotFound("************************** Account Not Found Sorry!! ******************************");

                    break;
                case 5:
                    System.out.print("Enter your Account Number Please: ");
                    long AccountNum5 = in.nextLong();
                    count = 0;
                    for (Transaction i : History) {
                        if (AccountNum5 == i.getAccountNumber()) {
                            System.out.println(i);
                            count++;
                        }
                    }
                    if (count == 0)
                        throw new AccountNumberNotFound("**************************** Account not found!!!! *************************");
                    break;
                case 6:
                    System.out.print("Enter your Account Number Please: ");
                    long AccountNum6 = in.nextLong();
                    count = 0;
                    for (Map.Entry<Long, Account> i : bank.entrySet()) {
                        if (AccountNum6 == i.getKey()) {
                            System.out.print("Enter the Account Number you want to Send Money: ");
                            long ThirdAccount = in.nextLong();
                            int count1 = 0;
                            for (Map.Entry<Long, Account> j : bank.entrySet()) {
                                if (ThirdAccount == j.getKey()) {
                                    System.out.print("Enter the amount: ");
                                    double amountTransfer = in.nextDouble();
                                    i.getValue().Withdraw(amountTransfer);
                                    j.getValue().Deposit(amountTransfer);
                                    History.add(new Transaction(AccountNum6, i.getValue().getBalance(), 0, ThirdAccount, amountTransfer));
                                    count1++;
                                    System.out.print("******************************** Transfer Completed successfully *****************************");
                                    count++;
                                    break;
                                }
                            }
                            if (count1 == 0)
                                throw new AccountNumberNotFound("Sender Account not found");

                        }
                    }
                    if (count == 0)
                        throw new AccountNumberNotFound("Account not found");
                    break;
                default:
                    System.out.println("********************* BYE ************************");
            }

        }
        while (n <= 6);


    }
}

