import java.util.Scanner;

public class Biaya{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukan tahun : ");
		int n = input.nextInt();

		double biayaAwal = 10000000;
		
		int i = 1;
		while(i <=  n){
			biayaAwal = biayaAwal + (0.06 * biayaAwal);
			
			i++;
		}
		

		System.out.println("Biaya kuliah pada tahun ke-" + n + " adalah: Rp " + (int)biayaAwal);
	}
}