public class Pattern {
    public static void main(String[] args) {

        int n = 4; // rows
        int m = 5; // columns

        // outer loop (rows)
        for (int i = 1; i <= n; i++) {

            // inner loop (columns)
            for (int j = 1; j <= m; j++) {
                System.out.print("*");
            }

            // next line after each row
            System.out.println();
        }
    }
}