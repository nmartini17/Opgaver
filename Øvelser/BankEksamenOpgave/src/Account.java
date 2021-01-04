public class Account implements Comparable<Account> {

    private double saldo;
    private int id;
    private String name;

    public Account(int id, String name) {
        this.saldo = 0;
        this.id = id;
        this.name = name;
    }

    public double withdrawMoney(double amount) throws InsufficientFundsException {
        if(saldo-amount<0) {
            throw new InsufficientFundsException();
        }
        saldo = saldo - amount;
        return amount;
    }

    public void depositMoney(double amount) {
        saldo = saldo + amount;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    //Typecaste ved at skrive (int) foran
    @Override
    public int compareTo(Account a) {
        return (int)(a.getSaldo()-this.getSaldo());
    }
}
