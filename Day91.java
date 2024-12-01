package soalcodingwar;

import java.util.Scanner;

public class soal4 {
    public static void main(String[] args) {
        Scanner tes = new Scanner(System.in);
        
       int angka;
       
       while(true){
           angka = tes.nextInt();
           
           if(angka % 2 == 0){
               System.out.println("pesan genap, mohon memasukan kembali angka");
           }else {
               System.out.println("you and i, end");
               break;
           }
       }
       
        
    }
  
}
