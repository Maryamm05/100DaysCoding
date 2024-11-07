import java.util.Scanner;

public class day67 {

    public static void konversiKeMenit(int detik) {
        int menit = detik / 60;
        System.out.println(menit + " menit");
    }

    public static void konversiKeJam(int detik) {
        int jam = detik / 3600;
        System.out.println(jam + " jam");
    }

    public static void konversiKeHari(int detik) {
        int hari = detik / 86400;
        System.out.println(hari + " hari");
    }

    public static void main(String[] args) {
        Scanner tes = new Scanner(System.in);

        int detik = tes.nextInt();
        tes.nextLine();
        String jk = tes.nextLine();

        switch (jk) {
            case "menit":
                konversiKeMenit(detik);
                break;
            case "jam":
                konversiKeJam(detik);
                break;
            case "hari":
                day67.konversiKeHari(detik);
                break;
            default:
                System.out.println("Jenis konversi tidak valid");
        }

    }

}
