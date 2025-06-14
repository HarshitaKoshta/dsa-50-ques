public class searchInRowColMat {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,7,8},{5,9,19}};
        int tar = 8;

        int row = 0;
        int col = mat[0].length - 1;

        while (row < mat.length && col >= 0) {
                if(mat[row][col]==tar){
                  System.out.println("target value found at index:["+row+"]["+col+"]");
                  break;
                }else if (mat[row][col] > tar){
                    col--;
            }else{
                row++;
            }
        }
    }
}
