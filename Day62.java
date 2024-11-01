import java.util.Scanner;

public class day62 {
    public static void main(String[] args) {
        Scanner tes = new Scanner(System.in);
        int k = tes.nextInt();
        
        if(k <= 0){
            System.out.println("k harus bernilai positif");
        }else {           
            while(true){
                int terserahkau = tes.nextInt();
                
                if (terserahkau == 0){
                    System.out.println("Tidak ada kelipatan dari " + k);  
                    break;
                }
                if (terserahkau % k == 0 && terserahkau > 0){
                    System.out.println(terserahkau);
                    break;
                }
            }
        }
        
    }
    
}
