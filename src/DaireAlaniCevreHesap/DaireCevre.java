package DaireAlaniCevreHesap;

import java.util.Scanner;

public class DaireCevre {
    public static void main(String[] args) {
        int r;
        double pi = 3.14,alan,cevre,a;

        Scanner scr = new Scanner(System.in);

        System.out.println("Dairenin yarı çapını giriniz: ");
        r = scr.nextInt();
        System.out.println("Merkez açının ölçüsünü giriniz: ");
        a = scr.nextDouble();

        alan = pi * r * r;
        System.out.println("Dairenin alanı: " + alan);
        cevre = 2 * pi * r;
        System.out.println("Dairenin Çevresi: " + cevre);
        alan = (pi*(r*r)*a)/360;
        System.out.println("Daire diliminin alanı: " + alan);
    }
}
