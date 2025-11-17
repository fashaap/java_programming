import java.util.Scanner;

public class DuaTerendah{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Jumlah siswa : ");
		int n = input.nextInt();

		String namaTerendah1 = "";
		int nilaiTerendah1 = Integer.MAX_VALUE;
		
		String namaTerendah2 = "";
		int nilaiTerendah2 = Integer.MAX_VALUE;
		
		int i = 1;
		while(i <= n){
			System.out.print("Siswa " + i + " : ");

			String nama = input.next();
			int nilai = input.nextInt();
			
			if(nilai < nilaiTerendah1){
				nilaiTerendah2 = nilaiTerendah1;
				namaTerendah2 = namaTerendah1;
				
				nilaiTerendah1 = nilai;
				namaTerendah1 = nama;
			}else if(nilai < nilaiTerendah2){
				nilaiTerendah2 = nilai;
				namaTerendah2 = nama;
			}
			
			i++;
		}
		
		System.out.println("Siswa dengan nilai terendah: " + namaTerendah1);
        System.out.println("Siswa dengan nilai kedua terendah: " + namaTerendah2);
	}
}