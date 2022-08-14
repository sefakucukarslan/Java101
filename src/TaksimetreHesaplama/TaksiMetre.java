package TaksimetreHesaplama;

import java.util.Scanner;

public class TaksiMetre {
    public static void main(String[] args) {
        int km;
        double perKm=2.20, total, startPrice = 10;

        Scanner scr = new Scanner(System.in);
        System.out.print("Mesafeti KM cinsinden giriniz: ");
        km = scr.nextInt();

        total = perKm * km;
        total += startPrice;
        total = (total < 20) ? 20 : total;

        System.out.println(total);
    }
}
