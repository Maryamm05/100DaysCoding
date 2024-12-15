
import java.util.Scanner;

public class day105 {
    public static void main(String[] args) {
        Scanner tes = new Scanner(System.in);
        
        int a = tes.nextInt();
        int b = tes.nextInt();
        double c = tes.nextDouble();
        
        int jumlah = a + b;
        double hasil = c * jumlah;
        
        System.out.println("hasil penjumlahan dari " + a + " dan" + b + " adalah : " + jumlah);
        System.out.println("hasil perkalian dari " + c + " dan" + jumlah + " adalah : " + hasil);
        
        
    }
    
}
