import java.util.Scanner;

public class day89 {

    public static void main(String[] args) {
        Scanner tes = new Scanner(System.in);

        String bilangan1 = tes.nextLine();
        String bilangan2 = tes.nextLine();

        String hasil = "";

        for (int i = 0; i < bilangan1.length(); i++) {
            char digit1 = bilangan1.charAt(i);
            char digit2 = bilangan2.charAt(i);

            if (digit1 != digit2) {
                hasil += "1";
            } else {
                hasil += "0";
            }

        }

        System.out.println(hasil);
    }

}
