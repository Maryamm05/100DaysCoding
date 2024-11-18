import java.util.Scanner;

public class day78 {

    public static void main(String[] args) {
        Scanner tes = new Scanner(System.in);

        String berland = tes.nextLine();
        String birland = tes.nextLine();
        String a = "";
        
        for (int i = berland.length() - 1; i >= 0; i--) {
            a += berland.charAt(i);
        }
        if (a.equals(birland)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}
