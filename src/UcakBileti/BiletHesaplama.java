package UcakBileti;

import java.util.Scanner;

public class BiletHesaplama {
    public static void main(String[] args) {
        int km,age,travelType;
        double price, discount, discountPrice, roundTrip;

        Scanner scr = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz : ");
        km = scr.nextInt();
        System.out.print("Yaşınızı giriniz : ");
        age = scr.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        travelType = scr.nextInt();

        price = km * 0.10;

        if (km < 0 || age < 0 || (travelType != 1 && travelType != 2))
            System.out.println("Hatalı değer girdiniz, lütfen tekrar deneyiniz.");

        if (age < 12){
            discount = price * 0.50;
            discountPrice = price - discount;
        } else if (age <= 24) {
            discount = price * 0.10;
            discountPrice = price - discount;
        } else if (age >= 65) {
            discount = price * 0.30;
            discountPrice = price - discount;
        }else {
            discountPrice = price;
        }

        if (travelType == 2){
            roundTrip = discountPrice - (discountPrice * 0.20);
            System.out.println("Toplam tutar: " + roundTrip * 2);
        } else if (travelType == 1) {
            System.out.println("Toplam tutar: " + discountPrice);
        }

    }
}
