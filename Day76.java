import java.util.Scanner;

public class day76 {

    public static void main(String[] args) {
        Scanner tes = new Scanner(System.in);

        String s = tes.nextLine();

        int toUppercase = 0;
        int toLowercase = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isUpperCase(c)) {
                toUppercase++;
            } else if (Character.isLowerCase(c)) {
                toLowercase++;
            }
        }
        if (toUppercase > toLowercase) {
            System.out.println(s.toUpperCase());
        } else {
            System.out.println(s.toLowerCase());
        }
    }

}
