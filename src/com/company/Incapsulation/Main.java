package com.company.Incapsulation;

public class Main {
    public static void main(String[] args) {

        Person p = new Person();

        p.setImya("Petro");
        System.out.println(p.getFullInfo());
        System.out.println(p.getImya());
    }
}
