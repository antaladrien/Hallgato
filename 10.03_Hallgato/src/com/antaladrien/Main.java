package com.antaladrien;

public class Main {

    public static void main(String[] args) {
        Hallgato h1 = new Hallgato("Lackó");
        Hallgato h2 = new Hallgato("Mackó", 5, 0);

        h1.targyFelvesz(5);
        if (!h1.vizsgázik())
            System.out.println(h1.azonosito + " hallgatónak sikertelen a vizsgája.");
        else
            System.out.println(h1.azonosito + " hallgató sikeresen vizsgázott.");

        if (!h2.vizsgázik())
            System.out.println(h2.azonosito + " hallgatónak sikertelen a vizsgája.");
        else
            System.out.println(h2.azonosito + " hallgató sikeresen vizsgázott.");

        System.out.println(h1);
        System.out.println(h2);
    }
}
