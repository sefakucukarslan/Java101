package MukemmelSayi;

import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        int value,total=0;
        Scanner scr = new Scanner(System.in);

        System.out.println("Bir sayı giriniz: ");
        value = scr.nextInt();

        for (int i = 1; i < value; i++){
            if (value % i == 0){
                total += i;
            }
        }
        if (total == value)
        System.out.println(value + " Mükemmel sayıdır.");
        else
        System.out.println(value + " Mükemmel sayı değildir.");
    }
}
