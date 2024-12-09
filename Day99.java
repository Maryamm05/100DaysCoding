import java.util.Scanner;

public class day99 {
    public static void main(String[] args) {
        Scanner tes = new Scanner(System.in);
        
        int x = tes.nextInt();
        int y = tes.nextInt();
        
        int tampung =0;
        
        if (x < y || y < x){
            for (int i = x; i <= y; i++) {
                if(i % 2 == 0 ){
                    tampung += i; 
                }else {
                    continue;
                }
            }
        }
        System.out.println(tampung);   
    }
    
}
