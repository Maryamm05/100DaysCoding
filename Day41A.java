package soal7nomor;

import java.util.Scanner;

public class jengjengjeng6 {
    public static void main(String[] args) {
        Scanner tes = new Scanner(System.in);
        
        int a = tes.nextInt();
        int b = tes.nextInt();
        a -= a * b /100;
       
        System.out.println(a);
    }
   
}
