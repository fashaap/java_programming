import java.util.Scanner;
//latihan

public class TotalHurufVokal {
    static final int nMax = 1000;

    public static void isiArray(char[] arr, int[] n, Scanner scanner) {
        String s = scanner.nextLine();
        n[0] = s.length();
        for (int i = 0; i < n[0]; i++) arr[i] = s.charAt(i);
    }

    public static boolean isSudahAda(char c, char[] arr, int total) {
        for (int i = 0; i < total; i++) {
            if (arr[i] == c) return true;
        }
        return false;
    }

    public static boolean isVokal(char c) {
        char x = Character.toLowerCase(c);
        return (x == 'a' || x == 'i' || x == 'u' || x == 'e' || x == 'o');
    }

    public static void prosesHurufVokal(char[] arr, int n, int[] total, char[] arrVokal) {
        for (int i = 0; i < n; i++) {
            if (Character.isLetter(arr[i]) && isVokal(arr[i])) {
                if (!isSudahAda(arr[i], arrVokal, total[0])) {
                    arrVokal[total[0]++] = arr[i];
                }
            }
        }
    }

    public static void ProsesHurufKonsonan(char[] arr, int n, int[] total, char[] arrKonsonan) {
        for (int i = 0; i < n; i++) {
            if (Character.isLetter(arr[i]) && !isVokal(arr[i])) {
                if (!isSudahAda(arr[i], arrKonsonan, total[0])) {
                    arrKonsonan[total[0]++] = arr[i];
                }
            }
        }
    }

    public static void ProsesHurufKarakter(char[] arr, int n, int[] total, char[] arrKar) {
        for (int i = 0; i < n; i++) {
            if (!Character.isLetter(arr[i])) {
                if (!isSudahAda(arr[i], arrKar, total[0])) {
                    arrKar[total[0]++] = arr[i];
                }
            }
        }
    }

    public static void cetakArrayDenganSpasi(char[] arr, int total) {
        if (total == 0) {
            System.out.println("Tidak ditemukan");
            return;
        }
        for (int i = 0; i < total; i++) {
            System.out.print(arr[i]);
            if (i < total - 1) System.out.print(" ");
        }
        System.out.println();
    }

    public static void cetakHuruf(char[] arr, int n) {
        int[] totalVokal = new int[1];
        int[] totalKonsonan = new int[1];
        int[] totalKarakterLain = new int[1];
        char[] arrVokal = new char[nMax];
        char[] arrKonsonan = new char[nMax];
        char[] arrKarakterLain = new char[nMax];

        prosesHurufVokal(arr, n, totalVokal, arrVokal);
        ProsesHurufKonsonan(arr, n, totalKonsonan, arrKonsonan);
        ProsesHurufKarakter(arr, n, totalKarakterLain, arrKarakterLain);

        System.out.println(totalVokal[0]);
        cetakArrayDenganSpasi(arrVokal, totalVokal[0]);

        System.out.println(totalKonsonan[0]);
        cetakArrayDenganSpasi(arrKonsonan, totalKonsonan[0]);

        System.out.println(totalKarakterLain[0]);
        cetakArrayDenganSpasi(arrKarakterLain, totalKarakterLain[0]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] arrC = new char[nMax];
        int[] N = new int[1];
        isiArray(arrC, N, scanner);
        cetakHuruf(arrC, N[0]);
        scanner.close();
    }
}
