import java.util.Scanner;

public class soal90 {

    public static void main(String[] args) {
        Scanner tes = new Scanner(System.in);

        int n = tes.nextInt();

        int kelompok = 0;
        String tampung = "";
        for (int i = 0; i < n; i++) {
            String magnet = tes.nextLine();
            if (!magnet.equals(tampung)) {
                kelompok++;
            }
            tampung = magnet;
        }
        System.out.println(kelompok);
    }

}
