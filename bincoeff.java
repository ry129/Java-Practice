public class bincoeff {
    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;

    }

    public static int bincoefff(int n, int r) {
        int a = factorial(n);
        int b = factorial(r);
        int c = factorial(n - r);
        int bincoefff = a / (b * c);
        return bincoefff;

    }

    public static void main(String[] args) {
        System.out.println(bincoefff(5, 2));
    }
    
}
