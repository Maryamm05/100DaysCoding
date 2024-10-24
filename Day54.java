import java.util.Scanner;

public class day54 {
    public static void main(String[] args) {
        Scanner tes = new Scanner(System.in);
        
        System.out.print("Masukan angka : ");
        int N = tes.nextInt();
        
        int Genap = 0;
        int Ganjil = 0;
        
        for (int i = 1; i <= N; i++) {
            if ( i % 2 == 0){
                Genap += i;
            }else  {
                Ganjil += i;
            }  
        }
                System.out.println(Genap + " ");
                System.out.print(Ganjil + " ");
    }
    
}
