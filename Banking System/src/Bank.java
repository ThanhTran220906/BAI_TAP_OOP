import java.io.InputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Bank {
    private List<Customer> customerList;

    public Bank() {
        this.customerList = new ArrayList<>();
    }

    public Bank(List<Customer> customerList) {
        this.customerList = customerList;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    /**
     * Read from inputStream.
     */
    public void readCustomerList(InputStream inputStream) {
        Scanner sc = new Scanner(inputStream);
        String readLine;

        if (sc.hasNextLine()) {
            readLine = sc.nextLine();
        } else {
            return;
        }
        // Loop for reading Customer info
        while (sc.hasNextLine()) {
            assert readLine != null;
            String[] partsCustomer = readLine.split("\\s+");
            StringBuilder customerName = new StringBuilder();
            long customerId = 0;

            for (String part : partsCustomer) {
                char firstChar = part.charAt(0);
                if (!Character.isDigit(firstChar)) {
                    if (customerName.toString().isEmpty()) {
                        customerName.append(part);
                    } else {
                        customerName.append(" ").append(part);
                    }
                } else {
                    customerId = Long.parseLong(part);
                }
            }

            Customer newCustomer = new Customer(customerId, customerName.toString());
            // Loop for reading the Customer's Account(s)
            while (
                    sc.hasNextLine()
                            && (readLine = sc.nextLine()) != null
                            && Character.isDigit(readLine.charAt(0))
            ) {
                String[] partsAccount = readLine.split(" ");

                if (partsAccount.length >= 3) {
                    long accountId = Long.parseLong(partsAccount[0]);
                    String operation = partsAccount[1];
                    double balance = Double.parseDouble(partsAccount[2]);

                    try {
                        if (Objects.equals(operation, Account.CHECKING)) {
                            newCustomer.addAccount(new CheckingAccount(accountId, balance));
                        } else if (Objects.equals(operation, Account.SAVINGS)) {
                            newCustomer.addAccount(new SavingsAccount(accountId, balance));
                        } else {
                            throw new IllegalArgumentException();
                        }
                    } catch (IllegalArgumentException e) {
                        System.err.println(e.toString());
                        return;
                    }
                }
            }

            // Check if Customer already exists in CustomerList
            // If so, add the Account(s) to the existing Customer
            int i = 0;
            while (i < customerList.size()) {
                if (customerList.get(i).getIdNumber() == customerId) {
                    for (Account account : newCustomer.getAccountList()) {
                        customerList.get(i).addAccount(account);
                    }
                    break;
                }
                i++;
            }

            // If Customer does not exist in CustomerList
            // Add the Customer along with their account(s)
            if (i == customerList.size()) {
                customerList.add(newCustomer);
            }
        }
    }

    /**
     * get Customers Info By Name Order.
     */
    public String getCustomersInfoByNameOrder() {
        StringBuilder res = new StringBuilder();
        customerList.sort(Comparator.comparing(Customer::getFullName));
        for (Customer customer : customerList) {
            res.append(customer.getCustomerInfo()).append("\n");
        }

        return res.toString();
    }

    /**
     * get Customers Info By Id Order.
     */
    public String getCustomersInfoByIdOrder() {
        StringBuilder res = new StringBuilder();
        customerList.sort(Comparator.comparing(Customer::getIdNumber));
        for (Customer customer : customerList) {
            res.append(customer.getCustomerInfo()).append("\n");
        }
        return res.toString();
    }
}
