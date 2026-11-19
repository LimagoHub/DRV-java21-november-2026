package main;

import tiere.Schwein;

public class Main {

    public static void main(String[] args) {
        Schwein schwein = new Schwein("Miss Piggy");
        System.out.println(schwein);

        schwein.fuettern();

        System.out.println(schwein);

        while(schwein.getGewicht() < 11);

        System.out.println(schwein);
    }
}
