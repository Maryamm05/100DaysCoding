import java.util.Scanner;
public class day97 {
	public static void main(String[] args) {
		Scanner tes = new Scanner(System.in);
	    
        int number = tes.nextInt();
        boolean isPrima = true;
	    
        if (number < 2) {
            isPrima = false;
        } else {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrima = false;
                    break;
                }
            }
        }
        if (isPrima) {
            System.out.println(number + " adalah bilangan prima.");
        } else {
            System.out.println(number + " bukan bilangan prima.");
        }
	    
	}
}
