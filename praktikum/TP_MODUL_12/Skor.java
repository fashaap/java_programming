import java.util.Scanner;

public class Skor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int MAKS_DATA = 100;
        int[] dataSkor = new int[MAKS_DATA];
        int jumlahSkor = 0;
        int totalSkor = 0;
        
		int nilai;
        do {
            nilai = input.nextInt();
            if (nilai >= 0 && jumlahSkor < MAKS_DATA) {
                dataSkor[jumlahSkor] = nilai;
                totalSkor += nilai;
                jumlahSkor++;
            }
        } while (nilai >= 0 && jumlahSkor < MAKS_DATA);

        double rataRata = (double) totalSkor / jumlahSkor;

        int diAtas = 0, sama = 0, diBawah = 0;
        for (int i = 0; i < jumlahSkor; i++) {
            if (dataSkor[i] > rataRata) {
                diAtas++;
            } else if (dataSkor[i] == rataRata) {
                sama++;
            } else {
                diBawah++;
            }
        }

        System.out.println(diAtas + " scores are above the average!");
        System.out.println(sama + " scores are equal to the average!");
        System.out.println(diBawah + " scores are below the average!");
    }
}
