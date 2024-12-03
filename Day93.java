
import java.util.Scanner;

public class day93 {

    public static void main(String[] args) {
        Scanner tes = new Scanner(System.in);

        int n = tes.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= 1; j--) {
                if (j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = 2; j <= n; j++) {
                if (j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
