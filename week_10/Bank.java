import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.List;

public class Bank {
    
    private java.util.List<Customer> customerList = new java.util.ArrayList<Customer>();

    /**
     * getCustomerList.
     */
    public java.util.List<Customer> getCustomerList() {
        return customerList;
    }

    /**
     * readCustomerList.
     */
    public void readCustomerList(InputStream inputStream) {
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
        String line = "";
        try {
            while ((line = br.readLine()) != null) {

                if (!line.contains(Account.CHECKING) && !line.contains(Account.SAVINGS)) {
                    int index = line.lastIndexOf(" ");
                    long idNumber = Long.parseLong(line.substring(index + 1, line.length()));
                    Customer customer = new Customer(idNumber, line.substring(0, index));
                    customerList.add(customer);
                } else {
                    String[] tokens = line.split("\\s");
                    if (line.contains(Account.CHECKING)) {
                        customerList.get(customerList.size() - 1)
                        .addAccount(new CheckingAccount(Long.parseLong(tokens[0]), 
                            Double.parseDouble(tokens[2])));
                    } else if (line.contains(Account.SAVINGS)) {
                        customerList.get(customerList.size() - 1)
                        .addAccount(new SavingsAccount(Long.parseLong(tokens[0]), 
                            Double.parseDouble(tokens[2])));
                    }
                }
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * getCustomersInfoByIdOrder.
     */
    public String getCustomersInfoByIdOrder() {
        List<Customer> customerList = getCustomerList();
        customerList.sort(Comparator.comparing(Customer::getIdNumber));
        String result = "";
        for (Customer customer : customerList) {
            result += customer.getCustomerInfo() + "\n";
        }
        return result;
    }

    /**
     * getCustomersInfoByNameOrder.
     */
    public String getCustomersInfoByNameOrder() {
        List<Customer> customerList = getCustomerList();
        String result = "";
        customerList.sort(Comparator.comparing(Customer::getFullName));
        for (Customer customer : customerList) {
            result += customer.getCustomerInfo() + "\n";
        }
        return result;
    }
}
