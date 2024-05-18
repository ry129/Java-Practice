public class questionarray {
    public static void main(String[] args) {
        int arr[][] = { { 3, 4, 7 }, { 5, 7, 8 } };
        
        
        int sum = 0;
    
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 7) {
                    sum++;
                }

            }

        }
        System.out.println(sum);
}
}
    
    

