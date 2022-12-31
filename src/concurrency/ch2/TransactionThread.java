package concurrency.ch2;

public class TransactionThread extends Thread{
    private String name;
    private BankAccount from;
    private BankAccount to;
    private double amount;
    public TransactionThread(String name, BankAccount from, BankAccount to, double amount) {
        this.name=name;
        this.from=from;
        this.to=to;
        this.amount=amount;
    }

    @Override
    public void run() {
        System.out.println("Transaction : " +this.name+ " from "+this.from+
                " to "+this.to+ " amount: "+ this.amount);
        transfer(from,to,amount);
    }

    public void transfer(BankAccount from, BankAccount to, double amount) {

        to.setDebit(to.getDebit()+amount);
        from.setDebit(from.getDebit()-amount);
        System.out.println(from.toString());
        System.out.println(to.toString());

    }
}


