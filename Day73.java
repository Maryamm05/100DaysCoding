import java.util.Scanner;

public class day73 {

    public static int hitungVokal(String kata) {
        String vokal = "aeiouAEIOU";
        int jumlahVokal = 0;

        for (int i = 0; i < kata.length(); i++) {
            if ((i + 1) % 2 == 1 && vokal.contains(String.valueOf(kata.charAt(i)))){
                jumlahVokal++;
            }

        }
        return jumlahVokal;
    }

    public static void main(String[] args) {
        Scanner tes = new Scanner(System.in);
        String kata = tes.nextLine();

        int hasil = hitungVokal(kata);
        System.out.println(hasil);
    }
}
