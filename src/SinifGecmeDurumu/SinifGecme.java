package SinifGecmeDurumu;

import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {

        int mat, turkce, fizik, kimya, muzik, ortalama;
        int toplamNot = 0;
        int toplamDersSayisi = 0;

        Scanner scr = new Scanner(System.in);

        System.out.println("Matematik notunuz : ");
        mat = scr.nextInt();
        if (!(mat <= 0 || mat > 100)){
            toplamNot += mat;
            toplamDersSayisi++;
        }

        System.out.println("Türkçe notunuz : ");
        turkce = scr.nextInt();
        if (!(turkce <= 0 || turkce > 100)){
            toplamNot += turkce;
            toplamDersSayisi++;
        }

        System.out.println("Fizik notunuz : ");
        fizik = scr.nextInt();
        if (!(fizik <= 0 || fizik > 100)){
            toplamNot += fizik;
            toplamDersSayisi++;
        }

        System.out.println("Kimya notunuz : ");
        kimya = scr.nextInt();
        if (!(kimya <= 0 || kimya > 100)){
            toplamNot += kimya;
            toplamDersSayisi++;
        }

        System.out.println("Müzik notunuz : ");
        muzik = scr.nextInt();
        if (!(muzik <= 0 || muzik > 100)){
            toplamNot += muzik;
            toplamDersSayisi++;
        }

        ortalama = toplamNot / toplamDersSayisi;

        if (ortalama <= 55){
            System.out.println("Kaldınız...");
        }
        else{
            System.out.println("Geçtiniz...");
        }
        System.out.println("Ortalamanız : " + ortalama);

    }
}
