import java.util.Scanner;
public class day103 {
    public static void main(String...args){
        Scanner tes = new Scanner(System.in);
        int a = tes.nextInt();
        int b = tes.nextInt();
        
        int hasil = (a * b - a + b );
        System.out.print(hasil);
    }
}
