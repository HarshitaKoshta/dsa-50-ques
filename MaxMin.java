class MaxMin{
    static void findMinMax(int[] arr){
         int min = arr[0];
         int max =arr[0];

         for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
         }
          System.out.println("maximum is:"+max);
           System.out.println("minimum is:"+min);
    } 
    public static void main(String[] args) {
        int[] arr ={8,21,4,64,67,9};
        findMinMax(arr);
    }
}