package main;

import bank.Angestellter;
import bank.Bank;

public class Main {

    public static void main(String[] args) {
        final Bank bank = new Bank();
        final Angestellter a1 = new Angestellter(bank, 0, 1, 20);
        final Angestellter a2 = new Angestellter(bank, 1, 2, 20);
        final Angestellter a3 = new Angestellter(bank, 2, 0, 20);

        System.out.println("Kontostand vorher:");
        bank.kontostand();

        a1.start();
        a2.start();
        a3.start();

    }
}
