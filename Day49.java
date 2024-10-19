import java.util.Scanner;

public class day49 {
    public static void main(String[] args) {
        Scanner tes = new Scanner(System.in);
        
        System.out.print("Masukan angka positif :");
        int N = tes.nextInt();
        
        if (N >= 1 && N < 10){
            System.out.println("satuan");
        }else if (N >= 10 && N < 100 ){
            System.out.println("puluhan");
        }else if (N >= 100 && N < 1000){
            System.out.println("ratusan");
        }else if( N >=1000 && N < 10000){
            System.out.println("ribuan");
        }else if (N >= 10000 && N <100000){
            System.out.println("puluhan ribu");
        }
    }
}
