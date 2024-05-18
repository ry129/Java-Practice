public class sumofrow {
    public static void row(int matrix[][]) {
        int sum = 0;

        for (int j = 0; j < matrix[0].length; j++) {
            sum += matrix[1][j];
        }
        System.out.println(sum);

    }

    public static void main(String[] args) {
        int matrix[][] = { { 3, 4, 5 }, { 11, 4, 3 }, { 6, 7, 7 } };
        row(matrix);
        }
       
    }
    

