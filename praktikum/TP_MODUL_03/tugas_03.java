import java.util.Scanner;

public class main{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Masukkan jumlah mil : ");
		String jumlah_mil = input.nextLine();
		
		int parseMil = Integer.parseInt(jumlah_mil);
		
		double nilai_km = 1.6;
		System.out.println( jumlah_mil + " mil sama dengan"  +  parseMil * nilai_km + " kilometer ");

	}
}