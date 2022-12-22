// 52
public class Exam3 {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int[][] a = solution(matrix);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static int[][] solution(int[][] matrix) {
        int smallRow = findSmallRow(matrix);
        if (smallRow != -1) {
            int[][] newMatrix = new int[matrix.length][matrix[0].length - 1];

            int col = 0;
            for (int i = 0; i < matrix.length; i++) {
                col = 0;
                for (int j = 0; j < matrix[i].length; j++) {
                    if (smallRow != j) {
                        newMatrix[i][col++] = matrix[i][j];
                    }
                }
            }
            return newMatrix;
        }
        return matrix;
    }

    public static int findSmallRow(int[][] matrix) {
        int smallItem = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (smallItem > matrix[i][j]) {
                    smallItem = matrix[i][j];
                    index = i;
                }
            }
        }

        return index;
    }
}
