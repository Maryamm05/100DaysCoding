public class PenjumlahanRekursif {

    public static int hitungPenjumlahan(int n) {
        if (n == 1) {
            return 1;
        }
        return n + hitungPenjumlahan(n - 1);
    }

    public static void main(String[] args) {
        int angka = 5;
        int hasil = hitungPenjumlahan(angka);
        System.out.println(hasil);
    }
}
