import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Bank {

    private String name;
    private List<Account> accounts;

    public Bank(String name) {
        this.name = name;
        accounts = new ArrayList<>();
    }

    public void addAccountToAccounts(Account account) {
        accounts.add(account);
    }

    public Account getHighestAccount() {
        Collections.sort(accounts);
        return accounts.get(0);
    }

    public Account getLowestAccount() {
        Collections.sort(accounts);
        return accounts.get(accounts.size()-1);
    }

    public String getName() {
        return name;
    }

    public List<Account> getAccounts() {
        return accounts;
    }
}
