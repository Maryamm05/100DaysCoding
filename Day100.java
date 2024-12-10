import java.util.Scanner;

public class day100 {

    public static void main(String[] args) {
        Scanner tes = new Scanner(System.in);

        System.out.print("Masukan angka pertama : ");
        int angka1 = tes.nextInt();
        System.out.print("Masukan operator : ");
        String operator = tes.next();
        System.out.print("Masukan angka kedua : ");
        int angka2 = tes.nextInt();

        int hasil;

        switch (operator) {

            case "+":
                hasil = angka1 + angka2;
                System.out.println(hasil);
                break;
            case "-":
                hasil = angka1 - angka2;
                System.out.println(hasil);
                break;
            case "*":
                hasil = angka1 * angka2;
                System.out.println(hasil);
                break;
            case "/":
                hasil = angka1 / angka2;
                System.out.println(hasil);
                break;
            case "%":
                hasil = angka1 % angka2;
                System.out.println(hasil);
                break;
        }
    }
}
