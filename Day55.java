import java.util.Scanner;


public class day55 {
    public static void main(String[] args) {
        Scanner tes = new Scanner (System.in);
        int N = tes.nextInt();
        
        for(int i = N; i >= 1 ; i--){
            if(N % i == 0){
                System.out.print(i + " ");
            }      
            
        }
        
    }
    
}
