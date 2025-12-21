import java.util.Scanner;

public class Descending {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = 6;
        String[][] dataMahasiswa = new String[n][2];

        for (int i = 0; i < n; i++) {
            dataMahasiswa[i][0] = input.nextLine();
            dataMahasiswa[i][1] = input.nextLine();
        }

        for (int i = 0; i < n - 1; i++) {
            int idxMax = i;

            for (int j = i + 1; j < n; j++) {
                int nilaiMax = Integer.parseInt(dataMahasiswa[idxMax][1]);
                int nilaiSekarang = Integer.parseInt(dataMahasiswa[j][1]);

                if (nilaiSekarang > nilaiMax) {
                    idxMax = j;
                }
            }

            String tempNama = dataMahasiswa[i][0];
            String tempNilai = dataMahasiswa[i][1];

            dataMahasiswa[i][0] = dataMahasiswa[idxMax][0];
            dataMahasiswa[i][1] = dataMahasiswa[idxMax][1];

            dataMahasiswa[idxMax][0] = tempNama;
            dataMahasiswa[idxMax][1] = tempNilai;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(dataMahasiswa[i][0] + "  " + dataMahasiswa[i][1]);
        }
    }
}
