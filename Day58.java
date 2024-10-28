import java.util.Scanner;

public class day58 {
    public static void main(String[] args) {
        Scanner tes = new Scanner (System.in);
        int X = tes.nextInt();
        
        if (X < 1) {
            System.out.println("Invalid input");    
        }else {
            while (X > 1 ){
            System.out.print(X + " ");
            if (X % 2 == 0){
                X-=2;
            }else {
            X-=1;    
            }
        }
    }
        System.out.print("1");
}
} 
