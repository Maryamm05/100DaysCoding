import java.util.Scanner;

public class day60 {
    public static void main(String[] args) {
        Scanner tes = new Scanner(System.in);
        
        int a = 0;
        int angka;
        
        do {
            angka = tes.nextInt();
            if(angka > 0){
                a += angka;
            }
        }while (angka !=0 );
        System.out.println(a);
    }
}
