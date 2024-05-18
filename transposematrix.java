public class transposematrix {
    public static void main(String[]args) {
        int row = 2;
        int col = 3;
        int matrix[][] = { { 2, 3, 7 }, { 5, 6, 7 } };
        printMatrix(matrix);
        // Transpose of the given matrix
        int tmatrix[][] = new int[col][row];
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < col; j++) {
                tmatrix[j][i] = matrix[i][j];// Assigning element
            }

        }
        printMatrix(tmatrix);

    }

    public static void printMatrix(int matrix[][]) {
        System.out.println("The matrix is:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
