package concurrency.ch2;

public class BankAccount {
    private String name;
    private double debit;
    private double depozit;
    private double withdraw;
    public BankAccount(String name, double debit) {
        this.name=name;
        this.debit=debit;
        this.depozit=0;
        this.withdraw=0;
    }

    public void withdraw(double amount) {
        longDatabaseCall();
        this.debit=this.debit-amount;
        this.withdraw=amount;
        System.out.println(this.name+ " a facut un deposit de: "+ amount);

    }

    public void deposit(double amount) {
        longDatabaseCall();
        this.debit=this.debit-amount;
        this.depozit=amount;
        System.out.println(this.name+ " a facut un deposit de: "+ amount);
        System.out.println(toString());
    }

    public void longDatabaseCall() {
        try {
            Thread.sleep(100);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", debit=" + debit +
                ", depozit=" + depozit +
                ", withdraw=" + withdraw +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDebit() {
        return debit;
    }

    public void setDebit(double debit) {
        this.debit = debit;
    }
}


