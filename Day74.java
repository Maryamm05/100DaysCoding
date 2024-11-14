import java.util.Scanner;

public class day74 {
    public static void main(String[] args) {
        
        Scanner tes = new Scanner(System.in);

        String kode = tes.nextLine();

        if (kode.length() < 8 || kode.length() > 12) {
            System.out.println("Kode Tidak Valid");
            return;
        }

        int jumlahHuruf = 0;
        int jumlahAngka = 0;
        for (int i = 0; i < kode.length(); i++) {
            char eaa = kode.charAt(i);
            
           
            if ((eaa >= 'A' && eaa <= 'Z') || (eaa >= 'a' && eaa <= 'z')) {
                jumlahHuruf++;
            }
            
            else if (eaa >= '0' && eaa <= '9') {
                jumlahAngka++;
            }
        }

        if (jumlahHuruf >= 2 && jumlahAngka >= 2) {
            System.out.println("Kode Valid");
        } else {
            System.out.println("Kode Tidak Valid");
        }
    }
}
