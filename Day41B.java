package soal7nomor;

import java.util.Scanner;

public class jengjeng7 {
    public static void main(String[] args) {
        Scanner tes = new Scanner(System.in);
        
        int a = tes.nextInt();
        int b = tes.nextInt();
        
        boolean usia1 = a == b;
        boolean usia2 = a > b;
        boolean usia3 = a < b;
        
      
        System.out.println(usia1);
        System.out.println(usia2);
        System.out.println(usia3);
        
    }
  
}
