public class largestnumarray {
    public static int greatest(int num[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (largest < num[i]) {
                largest = num[i];

            }
            if (smallest > num[i]) {/*smallest also counted here */
                smallest = num[i];

            }

        }
        System.out.println(smallest);
        return largest;
    

    }

    public static void main(String[] args) {
        int num[] = { 10, 20, 40, 30 };
        System.out.println(greatest(num));

    }
    
}
