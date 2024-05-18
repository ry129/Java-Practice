public class reversearray {
    public static void reve(int num[]){
        int first=0;
        int last=num.length-1;
        while(first<last){
            int temp = num[first];
            num[first] = num[last];
            num[last] = temp;
            first++;
            last--;
        }

    }

    public static void main(String[] args) {
        int num[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
        System.out.println("Original array:");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
        reve(num);
        System.out.println("reversed array:");
        for (int i = 0; i < num.length; i++) {
            System.out.print( num[i]+" ");
        }

    }
    
    
}
