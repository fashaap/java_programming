public class ConditionalTracking {
	public static void main(String[] args){
		int x = 10;
		int y = 5;
		int z = 15;
		int result = 0;
		
		if(x > 5){
			if(y < 10){
				result = x + y;
			}else{
				result = x - y;
			}
		}
		
		if(z > 10 && x == 10){
			result += z;
		}else{
			result = z - x;
		}
		

		
		System.out.println("Nilai akhir result: " + result);
	}
}