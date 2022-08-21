package DizidekiElemanlarinOrtalamasiniBulanProgram;

public class HarmonikSeri {
    public static void main(String[] args) {
        double harmonikSeri;
        double sum = 0;
        double harmonikAvarage = 0.0;

        int[] list = {1,2,3,4,5,6,7,8,9};

        for (int i : list){
            harmonikSeri = 1.0 / i;
            sum += harmonikSeri;
            harmonikAvarage = list.length / sum;
        }
        System.out.println("Harmonik ortalama: " + harmonikAvarage);
    }
}
