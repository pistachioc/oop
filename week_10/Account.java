
public abstract class Account {
    public static final String CHECKING = "CHECKING";
    public static final String SAVINGS = "SAVINGS";
    protected long accountNumber;
    protected double balance;
    protected java.util.List<Transaction> transactionList;

    /**
     * Constructor.
     */
    public Account() {
    }

    /**
     * Constructor with parameters.
     */
    public Account(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    /**
     * getAccountNumber.
     */
    public long getAccountNumber() {
        return accountNumber;
    }

    /**
     * getBalance.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * doWithdrawing.
     */
    public void doWithdrawing(double amount) throws BankException {
        if (amount < 0) {
            throw new InvalidFundingAmountException(amount);
        } else if (amount > this.balance) {
            throw new InsufficientFundsException(amount);
        }
        this.balance -= amount;
    }

    /**
     * doDepositing.
     */
    public void doDepositing(double amount) throws InvalidFundingAmountException {
        if (amount < 0) {
            throw new InvalidFundingAmountException(amount);
        }
        this.balance -= amount;
    }

    /**
     * getTransactionHistory.
     */
    public String getTransactionHistory() {
        String history = "Lịch sử giao dịch của tài khoản " 
                            + this.accountNumber + ":\n";
        
        for (Transaction transaction : transactionList) {
            history += transaction.getTransactionSummary();
        }
        return history;
    }

    /**
     * addTransaction.
     */
    public void addTransaction(Transaction transaction) {
        transactionList.add(transaction);
    }

    /**
     * equals.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if ((obj instanceof Account) == false) {
            return false;
        }
        Account account = (Account) obj;
        return this.accountNumber == account.accountNumber;
    }

    /**
     * withdraw.
     */
    public abstract void withdraw(double amount);

    /**
     * deposit.
     */
    public abstract void deposit(double amount);
}
