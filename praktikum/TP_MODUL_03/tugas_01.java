import java.util.Scanner;

public class tugas_01{
	public static void main(String[] args){
        Scanner input = new Scanner(System.in);
		
		System.out.println("Masukan jumlah anggota : ");
		int x_jumlahAnggota = input.nextInt();
		
		System.out.println("Masukan jumlah kue : ");
		int y_jumlahKue = input.nextInt();
		
		System.out.println("Jumlah kue yang yang tersisa setelah kue dibagikan " + x_jumlahAnggota % y_jumlahKue);
		
	}
}