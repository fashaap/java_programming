import java.util.Scanner;

public class Deret{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		int s = 0;
		int i = 1;
		
		while(i <= n){
			s = s + i;
			
			i++;
		}
		
System.out.println(s);
	}
}
