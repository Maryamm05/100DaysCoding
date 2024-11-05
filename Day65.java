import java.util.Scanner;

public class day65 {

    public static void main(String[] args) {
        Scanner tes = new Scanner(System.in);

        int N = tes.nextInt();

        while (N >= 10) {
            int jumlah = 0;

            while (N > 0) {
                jumlah += N % 10;
                N /= 10;
            }
            N = jumlah;
        }
        System.out.println(N);
    }

}
