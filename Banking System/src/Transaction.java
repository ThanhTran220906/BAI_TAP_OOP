public class Transaction {
    public static final int TYPE_DEPOSIT_CHECKING = 0;
    public static final int TYPE_WITHDRAW_CHECKING = 1;
    public static final int TYPE_DEPOSIT_SAVINGS = 2;
    public static final int TYPE_WITHDRAW_SAVINGS = 3;

    private int type;       // kiểu giao dịch
    private double amount; // số tiền giao dịch.
    private double initialBalance;      // số dư trước giao dịch
    private double finalBalance;        // số dư sau giao dịch

    /**
     * Constructor.
     */
    public Transaction(int type, double amount, double initialBalance, double finalBalance) {
        this.type = type;
        this.amount = amount;
        this.initialBalance = initialBalance;
        this.finalBalance = finalBalance;
    }

    private static String getTransactionTypeString(int type) {
        if (type == Transaction.TYPE_DEPOSIT_SAVINGS) {
            return "Nạp tiền tiết kiệm";
        } else if (type == Transaction.TYPE_WITHDRAW_SAVINGS) {
            return "Rút tiền tiết kiệm";
        } else if (type == Transaction.TYPE_DEPOSIT_CHECKING) {
            return "Nạp tiền vãng lai";
        } else if (type == Transaction.TYPE_WITHDRAW_CHECKING) {
            return "Rút tiền vãng lai";
        }
        return "Không xác định";
    }

    /**
     * get transaction summary.
     */
    public String getTransactionSummary() {
        return String.format(
                "- Kiểu giao dịch: %s. Số dư ban đầu: $%.2f. Số tiền: $%.2f. Số dư cuối: $%.2f.",
                getTransactionTypeString(this.type),
                this.initialBalance,
                this.amount,
                this.finalBalance
        );
    }


}
