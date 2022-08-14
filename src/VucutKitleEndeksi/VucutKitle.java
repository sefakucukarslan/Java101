package VucutKitleEndeksi;

import java.util.Scanner;

public class VucutKitle {
    public static void main(String[] args) {
        double boy,kilo,indeks;

        Scanner scr = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy = scr.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = scr.nextDouble();

        indeks = kilo / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz :" + indeks);


    }
}
