public class SavingsAccount extends Account {
    public SavingsAccount(long accountNumber, double balance) {
        super(accountNumber, balance);
    }

    public SavingsAccount() {
        super();
    }

    /**
     * withdraw.
     */
    public void withdraw(double amount) {
        try {
            doWithdrawing(amount);

            Transaction newTran = new Transaction(Transaction.TYPE_WITHDRAW_SAVINGS,
                    amount, this.balance + amount, this.balance);
            this.transactionList.add(newTran);
            return;
        } catch (InvalidFundingAmountException | InsufficientFundsException e) {
            System.out.println(e.getMessage());
            return;
        }
    }

    /**
     * deposit.
     */
    public void deposit(double amount) {
        try {
            doDepositing(amount);

            Transaction newTran = new Transaction(Transaction.TYPE_DEPOSIT_SAVINGS,
                    amount, this.balance - amount, this.balance);
            this.transactionList.add(newTran);
        } catch (InvalidFundingAmountException e) {
            System.out.println(e.getMessage());
            return;
        }
    }
}
