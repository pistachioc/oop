public class InvalidFundingAmountException extends BankException {

    /**
     * Constructor.
     */
    public InvalidFundingAmountException(String message) {
        super(message);
    }
    
    /**
     * Constructor.
     */
    public InvalidFundingAmountException(double amount) {
        super("Số tiền không hợp lệ: $" + String.format("%.2f", amount));
    }
}
