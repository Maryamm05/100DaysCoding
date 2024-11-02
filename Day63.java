import java.util.Scanner;

public class day63 {

    public static void main(String[] args) {
        Scanner tes = new Scanner(System.in);

        int N = tes.nextInt();

        int a = 0;

        for (int i = 1; i <= N; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                continue;

            } else if (i % 3 == 0 || i % 5 == 0){
                a++;
            }
        }
        System.out.println(a);
    }

}
