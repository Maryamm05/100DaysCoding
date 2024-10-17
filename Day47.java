import java.util.Scanner;

public class day47 {
    public static void main(String[] args) {
        Scanner tes = new Scanner(System.in);
       
        int a = tes.nextInt();
      
        if(a % 2 == 0 && a!= 0){
           System.out.println("bilangan " + a + " adalah genap");
        }if(a % 2 == 1){
            System.out.println("bilangan " + a + " adalah ganjil");
        }
    }
}
