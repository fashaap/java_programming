import java.util.Scanner;
class Main {
    //jumlah mahasiswa
    //nilai mahasiswa -> dikonfersi ke ALFABET
    //dicari nilai tertinggi

    public static int NilaiTertinggi(String[][] nilai, int n) {
        int max = Integer.parseInt(nilai[0][1]);
        for(int i = 1; i < n; i++){
            int maxKonfersi = Integer.parseInt(nilai[i][1]);
            if(maxKonfersi > max){
                max = maxKonfersi;
            }
        }

        return max;
    }

    public static void konfersiNIlai(String[][] nilai, int n){
        for(int i = 0; i < n; i++){
            int maxKonfersi = Integer.parseInt(nilai[i][1]);
            if(maxKonfersi >= 85){
                nilai[i][1] = "A";
            }else if(maxKonfersi >= 75){
                nilai[i][1] = "B";
            }else if(maxKonfersi >= 65){
                nilai[i][1] = "AB";
            }else if(maxKonfersi >= 55){
                nilai[i][1] = "C";
            }else{
                nilai[i][1] = "E";
            }
        }

        System.out.printf("%-20s %-5s", "Nama", "Nilai");
        for(int i = 0; i < n; i++){
            System.out.printf("\n%-20s %-5s", nilai[i][0], nilai[i][1]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Jumlah mahasiswa : ");
        int n = input.nextInt();
        String[][] dataMahasiswa = new String[n][2];

        input.nextLine();
        for(int i = 0; i < n; i++){
            System.out.print("Masukan Nama Mahasiswa: ");
            dataMahasiswa[i][0] = input.nextLine();
            System.out.print("Masukan Nilai: ");
            dataMahasiswa[i][1] = input.nextLine();
        }

        int hasilNilai = NilaiTertinggi(dataMahasiswa, n);
        konfersiNIlai(dataMahasiswa, n);
        System.out.println("Nilai Tertinggi : " + hasilNilai);
    }
}