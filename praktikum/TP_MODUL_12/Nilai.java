import java.util.Scanner;

public class Nilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlahMahasiswa = input.nextInt();
        int[] skorMahasiswa = new int[jumlahMahasiswa];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            skorMahasiswa[i] = input.nextInt();
        }

        int skorTertinggi = skorMahasiswa[0];
        for (int i = 1; i < jumlahMahasiswa; i++) {
            if (skorMahasiswa[i] > skorTertinggi) {
                skorTertinggi = skorMahasiswa[i];
            }
        }

        for (int i = 0; i < jumlahMahasiswa; i++) {
            char grade;
            int skor = skorMahasiswa[i];

            if (skor >= skorTertinggi - 5) {
                grade = 'A';
            } else if (skor >= skorTertinggi - 10) {
                grade = 'B';
            } else if (skor >= skorTertinggi - 15) {
                grade = 'C';
            } else if (skor >= skorTertinggi - 20) {
                grade = 'D';
            } else {
                grade = 'F';
            }

            System.out.println("Student " + i + " score is " + skor + " and grade is " + grade);
        }
    }
}
 