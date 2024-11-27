public class day87 {
    public static void main(String[] args) {
        int[] angka = {1, 2, 3, 4, 5};
        
        angka[2] = 10; 
        
        for (int i = 0; i < angka.length; i++) {
            System.out.println(angka[i]);
        }
    }
}
