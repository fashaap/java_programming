import java.util.Scanner;

public class Terendah {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan jumlah elemen : ");
        int n = input.nextInt();
        int[] Array = new int[n];

        System.out.print("Masukan elemen Array : ");
        for(int i = 0; i < n; i++){
            Array[i] = input.nextInt();
        }

        int terkecil = Array[0];

        for(int i = 1; i < n; i++){
            if(Array[i] < terkecil){
                terkecil = Array[i];
            }
        }

        System.out.println("Nilai minimum adalah " + terkecil);
    }
}
