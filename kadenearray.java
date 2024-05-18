public class kadenearray {
    public static void kadan(int number[]) {
        int cs = 0;
        int max = Integer.MIN_VALUE;/*-infinity */
        for (int i = 0; i < number.length; i++) {
            cs = cs + number[i];

            if (cs < 0) {
                cs = 0;
            }
            max = Math.max(cs, max);
        }
        System.out.println(max);

    }

    public static void main(String[] args) {
        int number[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        kadan(number);
    }
    
}
