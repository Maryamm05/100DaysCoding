import java.util.Scanner;

public class day88 {
    public static void main(String[] args) {
        Scanner tes = new Scanner(System.in);
        
        int n = tes.nextInt();
        
        int penampungan = 0;
        
        for (int i = 0; i < n; i++) {
        int p = tes.nextInt();
        int q = tes.nextInt();
            if(q - p >= 2){
                penampungan++;
            }
        }
        System.out.println(penampungan);
    }
    
}
