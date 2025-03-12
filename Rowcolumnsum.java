public class RowColSum {
    public static void main(String[] args) {
        int[][] arr = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        for (int i = 0; i < arr.length; i++) {
            int rowSum = 0, colSum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                rowSum += arr[i][j];
                colSum += arr[j][i];
            }
            System.out.println("Row " + i + " Sum: " + rowSum);
            System.out.println("Col " + i + " Sum: " + colSum);
        }
    }
}
