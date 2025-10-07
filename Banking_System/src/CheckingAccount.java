public class CheckingAccount extends Account {
    public CheckingAccount() {
        super();
    }

    public CheckingAccount(long accountNumber, double balance) {
        super(accountNumber, balance);
    }

    /**
     * withdraw.
     */
    public void withdraw(double amount) {
        try {
            doWithdrawing(amount);

            Transaction newTran = new Transaction(Transaction.TYPE_WITHDRAW_CHECKING,
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

            Transaction newTran = new Transaction(Transaction.TYPE_DEPOSIT_CHECKING,
                    amount, this.balance - amount, this.balance);
            this.transactionList.add(newTran);
            return;
        } catch (InvalidFundingAmountException e) {
            System.out.println(e.getMessage());
            return;
        }
    }
}