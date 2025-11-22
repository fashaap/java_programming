
public class soal03{
	public static void main(String[] args){
		
		int bilangan = 500;
        int total = 0;
		double rataRata;

        for (int i = 1; i <= bilangan; i++) {
            total += i;
        }
		
		rataRata = (double) total / bilangan;
		
		System.out.println(total);
		System.out.println(rataRata);
		
	}
}