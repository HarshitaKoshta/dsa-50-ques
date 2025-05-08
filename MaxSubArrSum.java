class MaxSubArrSum{
    static void maxArrSum(int[] a){
      int max = -651;
       
       for (int i = 0; i <a.length; i++) {
         int sum =0;
             for(int j =i;j<a.length;j++){
               sum += a[j];
               if(sum>max){
                max =sum;
               }
            }
       }
       System.out.println("maximum sub array sum is "+max);
    }
    public static void main(String[] args) {
        int[] a = {1,5,3,-2,4,-6,4};
        maxArrSum(a);
    }
}