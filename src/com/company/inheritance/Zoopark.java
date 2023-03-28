package com.company.inheritance;

public class Zoopark {
    public static void main(String[] args) {

        Dinozavr dinozavr = new Dinozavr();
        System.out.println("Dinozavr kaze " + dinozavr.privit());

        Korova korova = new Korova();
        System.out.println("Korova kaze " + korova.privit());
    }
}
