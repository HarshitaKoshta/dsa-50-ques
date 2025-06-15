public class SubMatTaget {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        int n =3;
        int target =12;
        int count = 0;
    for(int stRow= 0;stRow<n;stRow++){
        for (int stcol= 0; stcol < n;stcol++){
           for(int endRow = stRow;endRow<n;endRow++){
               for(int endCol = stcol;endCol<n;endCol++){
                 int sum =0;
                 for(int i=stRow;i<=endRow;i++){
                    for(int j=stcol;j<=endCol;j++){
                        sum+=mat[i][j];
                    }
                 }
                 if(sum==target){
                    count++;
                 }
               }
           }
        }
    }
    System.out.println(count);
 }
}
