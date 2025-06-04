public class snakeTraverse {
    
    public static void snakePrint(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) {
                  for (int j = 0; j < cols; j++) {
                    System.out.print(mat[i][j] + " ");
                }
            } else {
                  for (int j = cols - 1; j >= 0; j--) {
                    System.out.print(mat[i][j] + " ");
                }
            }
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 4, 5},
            {4, 5, 9},
            {7, 8, 9}
        };
        snakePrint(matrix);
    }
}


