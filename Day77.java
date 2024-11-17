import java.util.Scanner;

public class day77 {

    public static void main(String[] args) {
        Scanner tes = new Scanner(System.in);

        int n = tes.nextInt();
        tes.nextLine();
        int x = 0;

        for (int i = 0; i < n; i++) {
        String a = tes.nextLine();

            if (a.equals("++x")||a.equals("x++")){
            x++;
            }else if (a.equals("--x")||a.equals("x--")){
             x--;
            }
        }
        System.out.println(x);
    }

}
