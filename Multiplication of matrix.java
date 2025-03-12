public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] A = { {1, 2}, {3, 4} };
        int[][] B = { {5, 6}, {7, 8} };
        int[][] product = new int[A.length][B[0].length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                for (int k = 0; k < A[0].length; k++) {
                    product[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        for (int[] row : product) {
            for (int num : row) System.out.print(num + " ");
            System.out.println();
        }
    }
}
