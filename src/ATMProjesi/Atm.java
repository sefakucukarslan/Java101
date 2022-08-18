package ATMProjesi;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        String userName, password;
        int life = 3;
        int balance = 1500;
        int select;
        int price;
        Scanner scr = new Scanner(System.in);

        while (life > 0) {
            System.out.print("Kullanıcı adını giriniz: ");
            userName = scr.nextLine();
            System.out.print("Şifre giriniz: ");
            password = scr.nextLine();
            if (userName.equals("Patika") && password.equals("123")) {
                System.out.println("Başarılı bir şekilde giriş yapıldı.");
                System.out.println("Kodluyoruz Bank'a Hoşgeldiniz...");
                do {
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçin: ");
                    select = scr.nextInt();
                    switch (select){
                        case 1:
                            System.out.print("Yatırmak istediğiniz miktarı girin: ");
                            price = scr.nextInt();
                            balance += price;
                        case 2:
                            System.out.println("Çekmek istediğiniz tutar: ");
                            price = scr.nextInt();
                            if (price > balance){
                                System.out.println("Yetersiz bakiye");
                            }
                            else{
                                balance -= price;
                            }
                        case 3:
                            System.out.println("Mevcut bakiyeniz: " + balance);
                    }
                } while (select != 4);
                System.out.println("Tekrar görüşmek üzere...");
                break;
            } else {
                life--;
                if (life == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçin.");
                } else {
                    System.out.println("Kullanıcı adı veya parola hatalı tekrar deneyiniz.");
                    System.out.println("Kalan hakkınız: " + life);
                }
            }
        }
    }
}
