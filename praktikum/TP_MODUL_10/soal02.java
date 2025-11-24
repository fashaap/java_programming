import java.util.Scanner;

public class soal02{
	public static double z (int x, int y){
		return 5 * Math.sqrt(x);
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		
		double per1 = z(a, b);
		double per2 = z(b, a);
		
		System.out.printf("%,.3f %,.3f\n", per1, per2);
	}
}