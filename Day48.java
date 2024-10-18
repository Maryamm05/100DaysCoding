import java.util.Scanner;

public class day48 {
    public static void main(String[] args) {
        Scanner tes = new Scanner (System.in);
        
        System.out.print("Masukan usia : ");
        int usia = tes.nextInt();
        
        if( usia >= 60){
            System.out.println("Usia " + usia + " tahun adalah Lansia");
        }if (usia >= 18 && usia <=59){
            System.out.println("Usia " + usia + " tahun adalah Dewasa");
        }if (usia > 12 && usia <= 17){
            System.out.println("Usia " + usia + " tahun adalah Remaja");
        }else {
            }if (usia <= 12 && usia >= 0){
            System.out.println("Usia " + usia + " tahun adalah anak-anak"); 
        }
  
}

}
