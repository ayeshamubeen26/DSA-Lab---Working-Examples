public class MatrixRightDiagonalSum {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 8, 6},
                {7, 8, 9}
        };

        int rightDiagonalSum = calculateRightDiagonalSum(matrix);

        System.out.println("Right Diagonal Sum: " + rightDiagonalSum);
    }

    // Function to calculate the right (secondary) diagonal sum
    public static int calculateRightDiagonalSum(int[][] matrix) {
        int sum = 0;
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            sum += matrix[i][n - i - 1];
        }
        return sum;
    }
}
