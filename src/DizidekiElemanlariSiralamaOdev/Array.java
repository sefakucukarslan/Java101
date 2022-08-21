package DizidekiElemanlariSiralamaOdev;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int n;

        Scanner scr = new Scanner(System.in);

        System.out.print("Dizinin boyutu n : ");
        n = scr.nextInt();

        int[] list = new int[n];

        System.out.println("Dizinin Elemanlarını giriniz: ");

        for (int i = 0; i < list.length; i++){
            System.out.print((i + 1) +  ". Elemanı : ");
            list[i] = scr.nextInt();
        }
        Arrays.sort(list);
        System.out.print(Arrays.toString(list));
    }
}
