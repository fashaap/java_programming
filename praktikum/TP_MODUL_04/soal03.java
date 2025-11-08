import java.util.Scanner;

public class soal03{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
        System.out.print("Masukan tahun : ");
        int tahun = input.nextInt();
        input.nextLine();
        
        System.out.print("Masukan nama bulan : ");
        String bulan = input.nextLine();
		
		int jumlah_hari = 0;
		
		if(bulan.equals("Jan")){
			jumlah_hari = 30;
		}else if( bulan.equals("Mar") || bulan.equals("May") || bulan.equals("Jul") || bulan.equals("Aug") || bulan.equals("Oct") || bulan.equals("Dec")){
			jumlah_hari = 31;
		}else if(bulan.equals("Feb")){
			if((tahun % 400 == 0) || (tahun % 4 == 0 && tahun % 100 != 0)){
				jumlah_hari = 29;
			}else {
				jumlah_hari = 28;
			}
		}else {
			System.out.println("jan bukan nama bulan yang benar");
		}
		
		
		System.out.println(bulan+ " " + tahun + " Memiliki "  + jumlah_hari + " hari");
	}
}