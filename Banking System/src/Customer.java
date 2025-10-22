import java.util.ArrayList;
import java.util.List;

public class Customer {
    private List<Account> accountList;
    private long idNumber;
    private String fullName;

    /**
     * Constructor with no args.
     */
    public Customer() {
        this.idNumber = 0;
        this.fullName = "";
        this.accountList = new ArrayList<>();
    }

    /**
     * Constructor.
     */
    public Customer(long idNumber, String fullName) {
        this.idNumber = idNumber;
        this.fullName = fullName;
        this.accountList = new ArrayList<>();
    }

    /**
     * get Customer Info.
     */
    public String getCustomerInfo() {
        return String.format(
                "Số CMND: %d." + " Họ tên: %s.",
                this.idNumber,
                this.fullName
        );
    }

    void addAccount(Account account) {
        for (Account acc : accountList) {
            if (account.equals(acc)) {
                acc = account;
                return;
            }
        }
        accountList.add(account);
    }

    void removeAccount(Account account) {
        for (Account acc : accountList) {
            if (account.equals(acc)) {
                accountList.remove(acc);
                return;
            }
        }
    }

    public long getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(long idNumber) {
        this.idNumber = idNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public List<Account> getAccountList() {
        return accountList;
    }
}
