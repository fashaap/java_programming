import java.util.Scanner;

public class Alfabet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        input.nextLine();
		
		String[] daftarNama = new String[n];
		
		for(int i = 0; i < n; i++){
			daftarNama[i] = input.nextLine();
		}
		
		for(int i = 0 ; i < n - 1; i++){
			
			int idx = i; 
			for(int j = i + 1; j < n; j++){
				if(daftarNama[j].compareTo(daftarNama[idx]) < 0){
					idx = j;
				} 
			}
			
			String temp = daftarNama[idx];
			daftarNama[idx] = daftarNama[i];
			daftarNama[i] = temp;
			
		}
		
		for (int i = 0; i < n; i++) {
            System.out.println(daftarNama[i]);
        }	

    }
}