import java.util.Scanner;

public class soal01{
	
	public static int jumlahBus(int penumpang, int kapasitas){
		if(penumpang % kapasitas == 0){
			return penumpang / kapasitas;
		}else{
			return (penumpang / kapasitas) + 1;
		}
	}

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int m = input.nextInt();
		
		int bus = jumlahBus(n,m);
		
		System.out.println(bus + " bus");
		
		
	}
}