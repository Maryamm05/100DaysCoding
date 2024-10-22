import java.util.Scanner;

public class day52 {

    public static void main(String[] args) {
        Scanner tes = new Scanner(System.in);

        System.out.print("Nilai mahasiswa : ");
        int n = tes.nextInt();

        char nilai = (n >= 70 && n <= 75 || n > 85 ) ? 'A':
                     ( n >= 60 && n <= 85 || n == 50) ? 'B' :
                     (n < 60) ? 'C' : 'D' ;
        System.out.println("nilai akhirnya " + nilai);
            
   }
}
