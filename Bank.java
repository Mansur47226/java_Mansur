public class Bank {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();
        BusinessAccount ba = new BusinessAccount();

        sa.openAccount();
        sa.deposit(1000);

        ba.openAccount();
        ba.deposit(1000);
    }
}


abstract class BankAccount {
    double balance = 0;

    abstract void openAccount();
    abstract void deposit(double amount);
}


class SavingsAccount extends BankAccount {
    @Override
    void openAccount() {
        System.out.println("сберегательный счёт открыт");
    }

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("пополненно: " + amount + ". баланс: " + balance);
    }
}


class BusinessAccount extends BankAccount {
    @Override
    void openAccount() {
        System.out.println("бизнес счёт открыт");
    }

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("пополненно: " + amount + ". баланс: " + balance);
    }
}
