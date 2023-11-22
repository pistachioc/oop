public class Transaction {

    public static final int TYPE_DEPOSIT_CHECKING = 1;
    public static final int TYPE_DEPOSIT_SAVINGS = 2;
    public static final int TYPE_WITHDRAW_CHECKING = 3;
    public static final int TYPE_WITHDRAW_SAVINGS = 4;

    private int type;
    private double amount;
    private double initialBalance;
    private double finalBalance;

    /**
     * Constructor.
     */
    public Transaction(int type, double amount, double initialBalance, double finalBalance) {
        this.type = type;
        this.amount = amount;
        this.initialBalance = initialBalance;
        this.finalBalance = finalBalance;
    }

    /**
     * getTransactionType.
     */
    private String getTransactionTypeString(int type) {
        if (type == TYPE_DEPOSIT_CHECKING) {
            return "Nạp tiền vãng lai.";
        } else if (type == TYPE_DEPOSIT_SAVINGS) {
            return "Nạp tiền tiết kiệm.";
        } else if (type == TYPE_WITHDRAW_CHECKING) {
            return "Rút tiên vãng lai.";
        } else if (type == TYPE_WITHDRAW_SAVINGS) {
            return "Rút tiền tiết kiệm.";
        } else {
            return "Unknown.";
        }
    }

    /**
     * getTransactionSummary.
     */
    public String getTransactionSummary() {
        return "- Kiểu giao dịch:"
                + getTransactionTypeString(type)
                + " Số dư ban đầu: $" + String.format("%.2f", initialBalance)
                + ". Số tiền: $" + String.format("%.2f", amount)
                + ". Số dư cuối: $" + String.format("%.2f", finalBalance) + ".\n";
    }
}
