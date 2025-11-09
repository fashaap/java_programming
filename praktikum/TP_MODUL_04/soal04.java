import java.util.Scanner;

public class soal03{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("kamu mau angka 5 atau 10?");
	int pilihAngka = input.nextInt();
	
	switch(pilihAngka){
		case 5:
		
		System.out.println("Aku adalah 5");
		break;
		
		case 10:
		System.out.println("Aku adalah 10");
	}
	
	}
}