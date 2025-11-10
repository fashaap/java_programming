 import java.util.Scanner;

public class ipk{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukan nama : ");
		String name = input.nextLine();
		
		System.out.print("Masukan IPK : ");
		double score = input.nextDouble();
		
		String keterangan = "";
		boolean tidakLulus = false;
		
		if(score >= 3.50){
			keterangan = "beasiswa penuh";
		}else if(score >= 3.00 && score <= 3.49){
			keterangan = "beasiswa parsial";
		}else if(score < 3.00){
			keterangan = "syarat beasiswa";
			tidakLulus = true;
		}else{
			System.out.println("masukan tidak valid");
		}
		
		if(tidakLulus){
			System.out.println(name + " belum memenuhi " + keterangan);
		}else{
			System.out.println(name + " layak mendapatkan " + keterangan);
		}
		
	}
}