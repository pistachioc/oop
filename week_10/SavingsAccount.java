public class SavingsAccount extends Account {

    /**
     * Constructor.
     */
    public SavingsAccount(long accountNumber, double balance) {
        super(accountNumber, balance);
    }

    /**
     * withdraw.
     */
    @Override
    public void withdraw(double amount) {
        try {
            if (amount > 1000) {
                throw new InvalidFundingAmountException(amount);
            }
            if (this.balance < 5000) {
                throw new InsufficientFundsException(amount);
            }
            super.doWithdrawing(amount);
            Transaction transaction = new Transaction(Transaction.TYPE_WITHDRAW_SAVINGS,
                amount, this.balance + amount, this.balance);
            this.addTransaction(transaction);
        } catch (BankException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * deposit.
     */
    @Override
    public void deposit(double amount) {
        try {
            Transaction transaction = new Transaction(Transaction.TYPE_DEPOSIT_SAVINGS,
                amount, this.balance - amount, this.balance);
            super.doDepositing(amount);
            this.addTransaction(transaction);
        } catch (InvalidFundingAmountException e) {
            System.out.println(e.getMessage());
        }
    }
}