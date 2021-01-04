public class Main {

    public static void main(String[] args) {
        Account a1 = new Account(1,"Nicolais konto");
        Account a2 = new Account(2,"Rasmus Konto");
        Account a3 = new Account(3,"Dans Konto");

        Bank bank = new Bank("Nykredit");

        a1.depositMoney(1098);
        a2.depositMoney(1230);
        a3.depositMoney(12);
        try {
            a1.withdrawMoney(2000);
        } catch (InsufficientFundsException e){
            e.DisplayErrorMessage();
        }

        bank.addAccountToAccounts(a1);
        bank.addAccountToAccounts(a2);
        bank.addAccountToAccounts(a3);

        for (Account a: bank.getAccounts()) {
            System.out.println(a.getSaldo());
        }
    }
}
