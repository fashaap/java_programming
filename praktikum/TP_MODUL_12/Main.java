import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int[][] matrix = new int[3][3]; //3x3
		
		for(int i = 0; i <= 2; i++){
			for(int j = 0; j <= 2; j++){
				matrix[i][j] = input.nextInt();
			}
		}
		
		for(int i = 0; i <= 2; i++){
			for(int j = 0; j <= 2; j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}