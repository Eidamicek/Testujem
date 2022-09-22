import java.util.Random;
import java.util.Scanner;

public class Hodina1 {
    public static void main(String[] args) {
        int[] pole = new int[10];
        int low=0;
        int cislo = 0;
        Random r = new Random(10);
        for(int i = 0; i< pole.length;i++){
            pole[i] =r.nextInt(100);
            System.out.println(pole[i]);
        }
        for(int j=0; j< pole.length;j++){
            if(pole[j]<low){
                low = pole[j];
                cislo =j;
            }
        }
        System.out.println(low+"na pozici"+cislo);
    }
}
