import java.util.*;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Fibonacci series up to " + n + ":");
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 1; i < n; i++) {
            System.out.println(c);
            a = b;
            b = c;
            c = a + b;
        }
        
    }
    
}
