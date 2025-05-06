class NegInBegPosInEnd{
    static void arrange(int[] arr){
        for (int i = 0; i <arr.length; i++) {
             for (int j = 0 ;j < arr.length; j++){
           if(arr[i]<0)  {
             int temp = arr[i];
            arr[i] =arr[j];
            arr[j]=temp;
           }  
            }       
        }
         for(int num:arr){
    System.out.println(num);
    }
    }
    public static void main(String[] args) {
        int[] arr = {-1,2,-3,4,-2,4,0,-6};
        arrange(arr);
    }
}