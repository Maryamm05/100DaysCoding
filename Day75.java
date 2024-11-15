import java.util.Scanner;

public class day75 {

    public static void main(String[] args) {
        Scanner tes = new Scanner(System.in);

        String teks = tes.nextLine().toLowerCase();
        char target = tes.next().charAt(0);

        int frekuensi = 0;

        for (int i = 0; i < teks.length(); i++) {
            if (Character.toLowerCase(teks.charAt(i)) == target) {
                frekuensi++;
            }

        }

        System.out.println(frekuensi);
    }

}
