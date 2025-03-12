public class MaxMin2DArray {
    public static void main(String[] args) {
        int[][] arr = { {3, 8, 1}, {4, 12, 6}, {7, 2, 9} };
        int max = arr[0][0], min = arr[0][0];
        for (int[] row : arr) {
            for (int num : row) {
                if (num > max) max = num;
                if (num < min) min = num;
            }
        }
        System.out.println("Max: " + max + ", Min: " + min);
    }
}
