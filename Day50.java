import java.util.Scanner;

public class day50 {
    public static void main(String[] args) {
        Scanner tes = new Scanner(System.in);
        
        System.out.print("Masukan angka : ");
        int N = tes.nextInt();
        
        if(N % 2 == 1 && N < 30 ){
            System.out.println("ON");
        }else if(N % 2 == 0){
            if (N < 12){
                System.out.println("OFF");
            }else if (N >= 12 && N <=30){
                System.out.println("ON");
            }else if(N > 30){
                System.out.println("OFF");
            }
        }else {
            System.out.println("Lain-lain");
        }
    }
            
}
