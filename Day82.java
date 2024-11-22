import java.util.Scanner;
    public class day82 {
    public static void main(String[] args) {
        Scanner tes = new Scanner(System.in);   
        double angka = tes.nextDouble();
        
        System.out.println(Math.ceil(angka));
        System.out.println(Math.floor(angka));
        System.out.println(Math.round(angka));
        
    }
}
