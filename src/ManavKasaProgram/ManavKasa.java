package ManavKasaProgram;

import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        double armut = 2.14,elma = 3.67,domates = 1.11,muz = 0.95,patlican = 5.00,toplam;

        Scanner scr = new Scanner(System.in);

        System.out.print("Armut Kaç kilo ? :");
        armut *= scr.nextDouble();
        System.out.print("Elma Kaç kilo ? :");
        elma *= scr.nextDouble();
        System.out.print("Domates Kaç kilo ? :");
        domates *= scr.nextDouble();
        System.out.print("Muz Kaç kilo ? :");
        muz *= scr.nextDouble();
        System.out.print("Patlıcan Kaç kilo ? :");
        patlican *= scr.nextDouble();

        toplam = armut + elma + domates + muz + patlican;
        System.out.println("Toplam Tutar : " + toplam);
    }
}
