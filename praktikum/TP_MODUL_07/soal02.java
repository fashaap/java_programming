import java.util.Scanner;

public class soal02{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int bilangan = input.nextInt();
		
		for(int i = 1; i <= bilangan; i++){
			for(int j = 1; j <= i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
}