package HesapMakinesi;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int sayi1, sayi2,secim;

        Scanner scr = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz: ");
        sayi1 = scr.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        sayi2 = scr.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
        secim = scr.nextInt();

        switch (secim) {
            case 1:
                System.out.println("Sayıların toplamı : " + (sayi1 + sayi2));
                break;

            case 2:
                System.out.println("Sayıların farkı : " + (sayi1 - sayi2));
                break;

            case 3:
                System.out.println("Sayıların çarpımı : " + (sayi1 * sayi2));
                break;

            case 4:
                if (sayi2 != 0) {
                    System.out.println("Sayıların bölümü : " + (sayi1 / sayi2));
                } else {
                    System.out.println("Bu sayı 0'a bölünemez");
                }
                break;
            default:
                System.out.println("Geçersiz bir değer girdiniz...");
                break;
        }
    }
}
