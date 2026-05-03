package encapsulation_task2;

public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();

        bankAccount.setAccountNumber("123456");
        bankAccount.setBalance(1700.80);

        String istifadeciNomresi = bankAccount.getAccountNumber();
        double balans = bankAccount.getBalance();

        System.out.println("Istifadeci nomresi: " + istifadeciNomresi);
        System.out.println("Cari balans: " + balans);

    }
}