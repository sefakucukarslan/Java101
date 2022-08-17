package IkininKuvvetleri;

import java.util.Scanner;

public class IkininKuvvetleri {
    public static void main(String[] args) {
        int num;

        Scanner scr = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        num = scr.nextInt();

        for (int i = 1; i <= num; i*=4){
            System.out.println("4'un katı : " + i);
        }
        System.out.println("--------------------------------");
        for (int i = 1; i <= num; i*=5){
            System.out.println("5'in katı : " + i);
        }
    }
}
