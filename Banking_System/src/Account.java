import java.util.ArrayList;
import java.util.List;

public abstract class Account {
    public static final String CHECKING = "CHECKING";
    public static final String SAVINGS = "SAVINGS";
    protected long accountNumber;       // số tài khoản
    protected double balance;           // số dư
    protected List<Transaction> transactionList;    // danh sách giao dịch

    /**
     * Constructor.
     */
    public Account() {
        this.accountNumber = 0;
        this.balance = 0;
        this.transactionList = new ArrayList<>();
    }

    /**
     * Constructor.
     */
    public Account(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.transactionList = new ArrayList<>();
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    /**
     * do withdraw.
     */
    public void doWithdrawing(double amount) throws InsufficientFundsException,
            InvalidFundingAmountException {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            return;
        }

        if (amount <= 0) {
            throw new InvalidFundingAmountException(amount);
        }
        throw new InsufficientFundsException(amount);
    }

    /**
     * do deposit.
     */
    public void doDepositing(double amount) throws InvalidFundingAmountException {
        if (amount <= 0) {
            throw new InvalidFundingAmountException(amount);
        }
        this.balance += amount;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    /**
     * get transaction history.
     */
    public String getTransactionHistory() {
        StringBuilder res = new StringBuilder();
        res.append(String.format("Lịch sử giao dịch của tài khoản %d:", this.accountNumber));
        for (Transaction x : transactionList) {
            res.append("\n").append(x.getTransactionSummary());
        }
        return res.toString();
    }

    /**
     * add transaction.
     */
    public void addTransaction(Transaction transaction) {
        this.transactionList.add(transaction);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Account) {
            Account other = (Account) obj;
            return this.accountNumber == other.getAccountNumber();
        }
        return false;
    }
}

