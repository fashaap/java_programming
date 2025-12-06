import java.util.Scanner;

public class HitungRatarata {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        
        int n = 10;
        int[] permen = new int[n];
        
        for(int i = 0; i < n; i++){
            permen[i] = input.nextInt();
        }
        
        rataPermen(permen);
        
        
    }
        
    static void rataPermen(int[] permen){
        int jumlah = 0;
        for(int i = 1; i <= permen.length; i++){
             jumlah += permen[i - 1];
        }
        System.out.println(jumlah / permen.length);
    }

}