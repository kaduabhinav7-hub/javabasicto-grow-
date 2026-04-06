public class Pattern {
    public static void main(String[] args) {

        int n = 4; // rows
        int m = 5; // columns

        // outer loop
        for (int i = 1; i <= n; i++) {

            // inner loop
            for (int j = 1; j <= m; j++) {

                // print * on borders
                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // move to next line
            System.out.println();
        }
    }
}