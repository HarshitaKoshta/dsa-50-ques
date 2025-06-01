import java.util.Scanner;

public class DigonalMat {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows or columns (for square matrix): ");
        int n = sc.nextInt();
        int[][] Matrix = new int[n][n];

        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("matrix[" + i + "][" + j + "] = ");
                Matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Diagonal of the matrix are:");
        for(int i=0;i<Matrix.length;i++){
            for(int j=0;j<Matrix[i].length;j++){
                if(Matrix[i][j]==Matrix[j][i]){
                      System.out.println(Matrix[i][j]);
                }
            }
        }
    }
}
