public class integerfrequency {
    public static void freq(int num[]) {
        

        int a = 0;
        int b = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > 0) {
                a++;

            } else {
                b++;
            }
        }
        int neg[] = new int[b];

        int pos[] = new int[a];
        int j = 0;
        int k = 0;

        for (int i = 0; i < num.length; i++) {
            if (num[i] > 0) {
                pos[j] = num[i];
                j++;

            } else {
                neg[k] = num[i];
                k++;
            }

        }
        for (int i = 0; i < k; i++) {
            System.out.print(" " + neg[i]);
        }
        for (int i = 0; i < j; i++) {
    System.out.print(" " + pos[i]);
}
       
    }

    

    public static void main(String[] args) {
        int num[] = { -12, 11, -13, -5, 6, -7, 5, -3, -6 };
        freq(num);

    }
}
    

