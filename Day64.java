public class day64 {
    public static void main(String[] args) {
        
        oneLoop:
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            
            if (i == 3) {
                System.out.println("Break pada i : " + i);
                break oneLoop;
            }
        }
        System.out.println("Loop selesai.");
    }
}
