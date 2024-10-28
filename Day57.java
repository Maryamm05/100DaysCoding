import java.util.Scanner;

public class day57 {

    public static void main(String[] args) {
        Scanner tes = new Scanner(System.in);

        int N = tes.nextInt();
        int angka = 1;
        if (N < 1) {
            System.out.println("Invalid input");
        }else { 
            while (angka <= N) {
                System.out.print(angka + " ");
                angka *= 2;
            }
        }
    }
}
