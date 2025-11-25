import java.util.Scanner;

public class BusPandemi{
    double persentase(int penumpang, int kapasitas){
        return (double) penumpang / kapasitas * 100;
    }
    
    boolean berangkat(double persentase){
        return persentase >= 50.0 && persentase <= 75.0;
    }
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        BusPandemi keterangan = new BusPandemi();
        
		int kapasitas = input.nextInt();
        int penumpang = input.nextInt();
        
        double hasilPersentase = keterangan.persentase(penumpang, kapasitas);
        boolean status = keterangan.berangkat(hasilPersentase);
        
        if(status){
            System.out.println("berangkat");
        }else{
            System.out.println("tidak berangkat");
        }
    }
}
