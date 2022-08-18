package MinMaxDegerBulma;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        int loop,value,min = 0,max = 0;
        Scanner scr = new Scanner(System.in);

        System.out.println("Kaç tane sayı gireceksiniz: ");
        loop = scr.nextInt();

        for (int i = 1; i <= loop; i++){
            System.out.println(i + ".sayıyı giriniz: ");
            value = scr.nextInt();

            if (i == 1){
                max = value;
                min = value;
            }else{
                if (value > max){
                    max = value;
                } else if (value < min) {
                    min = value;
                }
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
