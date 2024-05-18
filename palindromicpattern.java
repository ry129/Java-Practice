public class palindromicpattern {
    public static void palin(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {/**space*? */
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {/**descending */
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {/**ascending */
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        palin(5);
    }
    
}
