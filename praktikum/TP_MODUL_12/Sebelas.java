import java.util.Scanner;

public class Sebelas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] bilangan = new int[11];

        for (int i = 0; i < 11; i++) {
            bilangan[i] = input.nextInt();
        }
		
        for (int i = 0; i < 10; i++) {
            if (bilangan[i] < bilangan[10]) {
                System.out.println(bilangan[i] + " is smaller than " + bilangan[10]);
            } else if (bilangan[i] > bilangan[10]) {
                System.out.println(bilangan[i] + " is greater than " + bilangan[10]);
            } else {
                System.out.println(bilangan[i] + " is equal to " + bilangan[10]);
            }
        }
    }
}
