package DikUcgenHipo;

import java.util.Scanner;

public class UcgenHesaplama {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        int a,b;
        double c;

        System.out.println("1.Kenarı giriniz: ");
        a = scr.nextInt();
        System.out.println("2.Kenarı giriniz: ");
        b = scr.nextInt();

        c = Math.sqrt((a * a) + (b * b));

        System.out.println("Hipotenüs: " + c);
    }
}
