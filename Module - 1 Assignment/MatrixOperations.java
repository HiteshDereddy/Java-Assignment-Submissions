
// Performing matrix addition and multiplication
public class MatrixOperations {
    public static void main(String[] args) {
        int[][] A = {{1, 2}, {3, 4}};
        int[][] B = {{5, 6}, {7, 8}};
        int[][] sum = new int[2][2];
        int[][] product = new int[2][2];

        // Matrix Addition
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                sum[i][j] = A[i][j] + B[i][j];
            }
        }

        // Matrix Multiplication
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    product[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("Matrix Addition:");
        for (int[] row : sum) System.out.println(java.util.Arrays.toString(row));

        System.out.println("Matrix Multiplication:");
        for (int[] row : product) System.out.println(java.util.Arrays.toString(row));
    }
}
