public class selectionsort {
    public static void select(int arr[]) {
        for (int i = 0; i < arr.length-1; i++) {
            int minpos = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[minpos] < arr[j]) {
                    minpos = j;
                }
            }
            //swap
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }
    }

   public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3,6,2,1,8,7,4,5,3,1 };
        select(arr);
        print(arr);
        
    }
    
}
