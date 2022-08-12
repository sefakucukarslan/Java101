package KDVHesap;

import java.util.Scanner;

public class KDV {
    public static void main(String[] args) {
        double tutar, kdvTutar, kdvliTutar, kdv;
        boolean kdvDurum;

        Scanner input = new Scanner(System.in);
        System.out.println("Ücret tutarını giriniz: ");
        tutar = input.nextDouble();

        kdvDurum = (0 < tutar) && (tutar < 1000);
        kdv = kdvDurum ? 0.18 : 0.8;

        kdvTutar = tutar * kdv;
        kdvliTutar = kdvTutar + tutar;

        System.out.println("KDV Oranı : " + kdv);
        System.out.println("KDV'siz Tutar : " + tutar);
        System.out.println("KDV Tutarı : " + kdvTutar);
        System.out.println("KDV'li Tutarı: " + kdvliTutar);
    }
}
