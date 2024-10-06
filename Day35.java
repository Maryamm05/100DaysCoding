import java.util.Scanner;

public class OperatorAritmatika {
    public static void main(String... args) {
        Scanner tes = new Scanner(System.in);
    
        System.out.print("Masukan jumah uang awal anda : ");
        int a = tes.nextInt();
        
        System.out.print("Masukan jumlah pengeluaran pertama  : ");
        int b = tes.nextInt();
        
        System.out.print("Masukan umlah pemasukan pertama : ");
        int c = tes.nextInt();
        
        System.out.print("Masukan jumlah pengeluaran kedua  : ");
        int d = tes.nextInt();
        
        System.out.print("Masukan jumlah pemasukan kedua : ");
        int e = tes.nextInt();
       
        System.out.println("Total keseluruhan uang sekarang = " + (a-b+c-d+e));
        
        
        
    }
}
