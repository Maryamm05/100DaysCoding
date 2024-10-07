import java.util.Scanner;

public class OperatorAritmatika {
    public static void main(String... args) {
        Scanner tes = new Scanner(System.in);
    
        System.out.print("Masukan harga satu barang : ");
        double hb = tes.nextDouble();
        
        System.out.print("Masukan jumlah barang yang ingin dibeli  : ");
        int jb = tes.nextInt();
        
        System.out.print("Masukan presentasi diskon : ");
        double pd = tes.nextDouble();
        
        System.out.print("Masukan jumlah uang yang anda miliki : ");
        double jumlahUang = tes.nextDouble();
        
        double totalSebelum = hb * jb;
        double totalDiskon = totalSebelum * (pd / 100);
        double totalSetelah = totalSebelum - totalDiskon;
        double sisaUangSetelahBayar = jumlahUang - totalSetelah;
        double tidakDapatDibagiRp50k = sisaUangSetelahBayar % 50000;
       
        System.out.println("Total harga sebelum diskon : " + totalSebelum);
        System.out.println("Total harga setelah diskon : " + totalSetelah);
        System.out.println("Sisa uang setelah pembayaran : " + sisaUangSetelahBayar);
        System.out.println("Sisa uang yang tidak dapat dibagi dalam pecahan RP50.000 : " + tidakDapatDibagiRp50k);

   }
}
