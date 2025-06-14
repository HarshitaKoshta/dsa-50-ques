
import java.util.Scanner;

public class SetMatrix0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[][] mat= new int[t][t]; 
        int m = mat.length;
        int n = mat[0].length;

        for (int idx = 0; idx < mat.length; idx++) {
             for (int j = 0; j < mat[idx].length; j++) {
                mat[idx][j] = sc.nextInt();
             }          
        }

        
    }
}
