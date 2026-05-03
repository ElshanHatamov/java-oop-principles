package abstract_task3;

public class Main {
    public static void main(String[] args) {

        SavingsAccount savingsAccount = new SavingsAccount("12345",150);
        System.out.println(savingsAccount.getBalance());

        CurrentAccount currentAccount = new CurrentAccount("111111", 200);
        System.out.println();currentAccount.balance(200);
        currentAccount.withdraw(200);
    }
}
