package KullaniciGiris;

import java.util.Scanner;

public class KullaniciGiris {
    public static void main(String[] args) {
        String userName, password, select, newPassword;


        Scanner scr = new Scanner(System.in);

        System.out.println("Kullanıcı Adınız: ");
        userName = scr.nextLine();

        System.out.println("Şifreniz: ");
        password = scr.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş başarılı...");
        }
        else {
            System.out.println("Şifreyi hatalı, sıfırlamak ister misiniz ?");
            System.out.println("1-Evet\n2-Hayır");
            select = scr.nextLine();
            if (select.equals("Hayır")) {
                System.out.println("Giriş Sonlandırıldı.");}

            else if (select.equals("Evet")) {
                    System.out.println("Yeni şifrenizi giriniz: ");
                    newPassword = scr.nextLine();
                    if (newPassword.equals("java123") || newPassword.equals(password)) {
                        System.out.println("Hatalı giriş tekrar deneyiniz");
                    }
                    else {
                        System.out.println("Şifre başarıyla yenilendi");
                    }
                }
            else {
                    System.out.println("Hatalı seçim...");
                }

        }
    }
}