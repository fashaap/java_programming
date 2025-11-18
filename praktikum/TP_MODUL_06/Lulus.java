import java.util.Scanner;

public class Lulus{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);

		while(true){
			System.out.print("Masukan nilai anda : ");
		    int nilai = input.nextInt();
			
			if(nilai == -1){
				System.out.println("Invalid");
				break;
			}else if(nilai >= 60){
				System.out.println("Anda lulus ujian");
			}else {
				System.out.println("Anda tidak lulus ujian");
			}
		}
	}
}