package variabel_constanta;

public class Variabel_constanta{

    public static void main(String[] args){
    /*fungsi dari final adalah untuk membuat nila/value
        pada variabel yang tidak dapat diubah*/
    
    //Contoh dari variable constanta (final variabel)
       final String nama = "Maryam";
        System.out.println("Nama = " + nama);
        
        /*Ini contoh dari variabel konstanta yang sudah difinalkan
        namun masih ingin di updat lagi dan hasilnya akan error
        
        nama = "Maryam";
        System.out.println("Nama = " + nama);*/
       
       //Contoh beberapa penggunaan variabel final di berbagai tipe data
       final int Umur = 18;
        System.out.println("Umur = " + Umur + " tahun");
        
        final char kelas = 'D';
        System.out.println("Kelas = " + kelas);
        
        final String prodi= "Informatika";
        System.out.println("Prodi = " + prodi);
        
        final float berat_badan = (float) 43.5;
        System.out.println("Berat badan = " + berat_badan + "kg");
        
        final double tinggi = 153.11;
        System.out.println("Tinggi badan = " + tinggi + "cm");

    }
}
