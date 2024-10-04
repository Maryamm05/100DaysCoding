public class day33 {
    public static void main(String[] args) {
       
        //tipe casting adalah proses mengubah tipe data satu ke tipe data lain yang dimana
        //fungsinya itu untuk mengubah tipe data agar sesuai dengan kebutuhan program seperti
        //menghemat memori, menggunsksn operasi khusus atau menggabungkan tipe data yang berbeda
        
        byte a = 10;  // variabel a bertipe int
        long b = a;  // casting dari tipe data int ke tipe data long

        System.out.println(a);      
        System.out.println(b);  
        
        long c =500;   //variabel c bertipe data long
        byte d =(byte) c; //dicasting dari tipe data long ke tipe data byte
        
        System.out.println(c);
        System.out.println(d);
        
        
    }
}
