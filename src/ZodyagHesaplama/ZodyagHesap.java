package ZodyagHesaplama;

import java.util.Scanner;

public class ZodyagHesap {
    public static void main(String[] args) {
        int date;
        String burc = "";

        Scanner scr = new Scanner(System.in);

        System.out.print("Doğum yılınızı giriniz: ");
        date = scr.nextInt();

        if (date % 12 == 0){
            burc = "Maymun";
        } else if (date % 12 == 1) {
            burc = "Horoz";
        } else if (date % 12 == 2) {
            burc = "Köpek";
        } else if (date % 12 == 3) {
            burc = "Domuz";
        } else if (date % 12 == 4) {
            burc = "Fare";
        }else if (date % 12 == 5) {
            burc = "Öküz";
        }else if (date % 12 == 6) {
            burc = "Kaplan";
        }else if (date % 12 == 7) {
            burc = "Tavşan";
        }else if (date % 12 == 8) {
            burc = "Ejderha";
        }else if (date % 12 == 9) {
            burc = "Yılan";
        }else if (date % 12 == 10) {
            burc = "At";
        }else if (date % 12 == 11) {
            burc = "Koyun";
        }
        System.out.println("Çin Zodyağı Burcunuz : " + burc);
    }
}
