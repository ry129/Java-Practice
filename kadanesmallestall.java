public class kadanesmallestall {
    public static void kadan(int number[]) {
        int cs = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < number.length; i++) {
            cs = number[i];

            if (cs < 0) {
                min = Math.min(cs, min);

            }

        }
        System.out.println(min);
        

    }

    public static void main(String[] args) {
        int number[] = { -1,-2,-3,-4 };
        kadan(number);
    }
    
}

    

