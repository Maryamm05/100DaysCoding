import java.util.Scanner;

public class inputDariKeyboard {
    public static void main(String[] args) {
        Scanner tes = new Scanner(System.in);
    
        System.out.print("Masukan nama lengkap anda : ");
        String nama = tes.next();
        
        System.out.print("Masukan usia anda : ");
        int umur = tes.nextInt();
        
        System.out.print("Masukan jenis kelamin anda : ");
        char jk = tes.next().charAt(0);
        
        System.out.print("Masukan tinggi badan : ");
        double tinggi = tes.nextDouble();
        
        System.out.print("Apakah anda sudah menikah? ");
        boolean status = tes.nextBoolean();
       
        System.out.println("\nFormulir Pendaftaran");
        System.out.println("====================");
        System.out.println("Nama lengkap  : " + nama );
        System.out.println("Usia          : " + umur + " tahun " );
        System.out.println("Jenis kelamin : " + jk );
        System.out.println("Tinggi badan  : " + tinggi + " cm ");
        System.out.println("Status        : " + status );
        
        
        
    }
}
