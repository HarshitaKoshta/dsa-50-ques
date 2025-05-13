class TransposeMatrixCal{
    static void TransposeCal(int[][] arr){
        
       int[][] transposed = new int[arr[0].length][arr.length];

        for (int i = 0; i < arr.length; i++) {
          for (int j = 0; j < arr[i].length; j++) {
             transposed[j][i] = arr[i][j];
          }
        }
         for (int i = 0; i < transposed.length; i++) {
            for (int j = 0; j < transposed[i].length; j++) {
                System.out.print(transposed[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] arr ={{1,2,3},{13,3,5},{23,5,6},{2,4,45}};
        TransposeCal(arr);
    }
}