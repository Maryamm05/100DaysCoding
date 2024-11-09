
import java.util.Scanner;

public class soal7 {
    public static void main(String[] args) {
        Scanner tes = new Scanner(System.in);
        
        int N = tes.nextInt();
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j ){
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                    
                }
            }System.out.println();
        }
    }
    
