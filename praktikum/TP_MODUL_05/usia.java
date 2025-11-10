import java.util.Scanner;

public class usia{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukan usia : ");
		int usia = input.nextInt();
		
		String keteranganUsia = "";
		
		if(usia < 13){
			keteranganUsia = "Anak - anak";
		}else if(usia >= 13 && usia <= 17){
			keteranganUsia = "Remaja";
		}else if(usia >= 18 && usia <= 59){
			keteranganUsia = "Dewasa";
		}else{
			keteranganUsia = "Lansia";
		}
		
		System.out.println(keteranganUsia);
		
	}
}