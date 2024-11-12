public class MatrixLeftDiagonalSum {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int leftDiagonalSum = calculateLeftDiagonalSum(matrix);

        System.out.println("Left Diagonal Sum: " + leftDiagonalSum);
    }

    // Function to calculate the left (main) diagonal sum
    public static int calculateLeftDiagonalSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }
}
