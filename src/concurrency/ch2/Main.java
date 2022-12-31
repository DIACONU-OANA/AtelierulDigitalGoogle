package concurrency.ch2;

import concurrency.ch3.Player;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        BankAccount b1 = new BankAccount("Oana",1000);
        BankAccount b2 = new BankAccount("CICI",1000);
        TransactionThread thread=new TransactionThread("Bani Pizza",b1,b2,24);
        thread.start();
        thread.join();
        b1.deposit(40);

    }
}
