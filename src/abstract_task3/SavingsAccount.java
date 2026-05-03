package abstract_task3;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void balance(double amount) {

        setBalance(getBalance() + amount);
        System.out.println(amount + "Mebleginde pul yuklenildi.. Cari balans: " + getBalance());
    }

    @Override
    public void withdraw(double amount) {

        if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
            System.out.println(amount + "Mebleginde pul cixarildi.. Cari balans: " + getBalance());
        } else {
            System.out.println("Yeterli vesait yoxdur");
        }
    }
}