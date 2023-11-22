public class Customer {
    
    private long idNumber;
    private String fullName;
    private java.util.List<Account> accountList = new java.util.ArrayList<>();

    /**
     * Contructor.
     */
    public Customer() {
    }

    /**
     * Constructor.
     */
    public Customer(long idNumber, String fullName) {
        this.idNumber = idNumber;
        this.fullName = fullName;
    }

    /**
     * getCustomerInfo.
     */
    public String getCustomerInfo() {
        return "Số CMND: " + idNumber + ". Họ tên: " + fullName + ".";
    }

    /**
     * addAccount.
     */
    public void addAccount(Account account) {
        for (Account a : accountList) {
            if (a.equals(account)) {
                return;
            }
        }
        accountList.add(account);
    }

    /**
     * removeAccount.
     */
    public void removeAccount(Account account) {
        for (Account a : accountList) {
            if (a.equals(account)) {
                accountList.remove(a);
                return;
            }
        }
    }

    /**
     * getIdNumber.
     */
    public long getIdNumber() {
        return idNumber;
    }

    /**
     * setIdNumber.
     */
    public void setIdNumber(long idNumber) {
        this.idNumber = idNumber;
    }

    /**
     * getFullName.
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * setFullName.
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * getAccountList.
     */
    public java.util.List<Account> getAccountList() {
        return accountList;
    }
}
