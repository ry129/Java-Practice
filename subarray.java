


public class subarray {
    public static void sub(int num[]) {
        int ts = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < num.length; i++) {
            int start = i;
            for (int j = i; j < num.length; j++) {
                int end = j;
                int a = 0;/*sub array sum */
                for (int k = start; k <= end; k++) {
                    System.out.print(num[k] + " ");
                    a = a + num[k];

                }
                if (a == 30) {
                    System.out.println(start + "to" + end);

                }
           
                System.out.print("=" +" "+a);
                if (a > max) {
                    max = a;
                }
                if (a < min) {
                    min = a;
                }

                ts++;
                System.out.println();

            }

            System.out.println();

        }
        System.out.println("max="+max);
        System.out.println("min=" + min);
            
        System.out.println(ts);
        

        }
    
    

    public static void main(String[] args) {
        int num[] = { 2, 4, 6, 8, 10 };
        sub(num);
    }

}
