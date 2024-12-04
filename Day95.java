import java.util.Scanner;
public class day95 {
    public static void main(String[] args) {
        Scanner tes = new Scanner(System.in);
        
        int a = tes.nextInt();
        System.out.println("\nPola Segitiga Siku-Siku:");
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println("\nPola Segitiga Siku-Siku Terbalik:");
        for (int i = a; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

       
    }
}
