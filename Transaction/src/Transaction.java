public class Transaction {
    private String operation;
    private double amount;
    private double balance;
    public static final String DEPOSIT = "deposit";
    public static final String WITHDRAW = "withdraw";

    /**
     * transaction constructor 1.
     */
    public Transaction() {
        operation = "";
        amount = 0;
        balance = 0;
    }

    /**
     * transaction constructor 2.
     */
    public Transaction(String operation, double amount, double balance) {
        this.operation = operation;
        this.amount = amount;
        this.balance = balance;
    }

    //getter and setter
    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
