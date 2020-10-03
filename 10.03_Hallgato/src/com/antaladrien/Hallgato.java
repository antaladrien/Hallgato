package com.antaladrien;

public class Hallgato {
    String azonosito;
    int evfolyam, kredit;

    public Hallgato(String azonosito, int evfolyam, int kredit) {
        this.azonosito = azonosito;
        this.evfolyam = evfolyam;
        this.kredit = kredit;
    }

    public Hallgato(String azonosito) {
        this(azonosito, 1,0) ;
    }

    public void targyFelvesz(int targyKredit) {
        kredit += targyKredit;
    }

    public boolean vizsgázik() {
        if (kredit > 0) {
            evfolyam++;
            kredit = 0;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "azonosito: " + azonosito + ", evfolyam: " + evfolyam + ", kredit: " + kredit;
    }
}
