public class pattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows (half of the diamond)
       
        // Upper half of the diamond (pyramid)
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");  // Print spaces
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");  // Print stars
            }
            System.out.println();
        }

        // Lower half of the diamond (inverted pyramid)
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");  // Print spaces
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");  // Print stars
            }
            System.out.println();
        }
    }
}







