import java.util.ArrayList;
import java.util.Objects;

public class Account {
    private final ArrayList<Transaction> transitionList;
    private double balance;

    /**
     * Account constructor.
     */
    public Account() {
        this.balance = 0;
        this.transitionList = new ArrayList<>();
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public ArrayList<Transaction> getTransactionList() {
        return transitionList;
    }

    /**
     * Deposit with para double amount.
     */
    private void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban nap vao khong hop le!");
            return;
        }
        this.balance +=  amount;
    }

    /**
     * Withdraw with para double amount.
     */
    private void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban rut ra khong hop le!");
            return;
        }
        if (amount > this.balance) {
            System.out.println("So tien ban rut vuot qua so du!");
            return;
        }
        this.balance -= amount;
    }

    /**
     * Add Transaction to transactionList.
     */
    public void addTransaction(double amount, String operation) {
        if (Objects.equals(operation, Transaction.DEPOSIT)) {
            double lastBalance = this.balance;
            deposit(amount);
            if (lastBalance != this.balance) {
                transitionList.add(new Transaction(operation,
                        amount, this.balance));
            }
        } else if (Objects.equals(operation, Transaction.WITHDRAW)) {
            double lastBalance = this.balance;
            withdraw(amount);
            if (lastBalance != this.balance) {
                transitionList.add(new Transaction(operation,
                        amount, this.balance));
            }
        } else {
            System.out.println("Yeu cau khong hop le!");
        }
    }

    /**
     * print transaction list.
     */
    public void printTransaction() {
        for (int i = 0; i < transitionList.size(); i++) {
            System.out.printf("Giao dich %d: %s $%.2f. So du luc nay: $%.2f.\n",
                    i + 1,
                    Objects.equals(transitionList.get(i).getOperation(), Transaction.DEPOSIT) ? "Nap tien" : "Rut tien",
                    transitionList.get(i).getAmount(),
                    transitionList.get(i).getBalance());
        }
    }
}
