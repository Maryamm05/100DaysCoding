import java.util.Scanner;

public class day53 {
    public static void main(String[] args) {
        Scanner tes = new Scanner(System.in);
        
        System.out.print("Masukan angka : ");
        int N = tes.nextInt();
        
        for (int i = 1; i <= N; i++) {
            if ( i % 2 == 0 && i % 3 != 0){
                System.out.print(i + " ");
            }
            
        }
    }
    
}
