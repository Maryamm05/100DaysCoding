import java.util.Scanner;
public class day97 {
	public static void main(String[] args) {
		Scanner tes = new Scanner(System.in);
        int N = tes.nextInt();

        for (int number = 1; number <= N; number++) {
            if (isPrima(number)) {
                System.out.print(number + " ");
            }
        }
    }
    public static boolean isPrima(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
