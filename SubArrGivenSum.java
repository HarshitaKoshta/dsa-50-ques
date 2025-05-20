class SubArrGivenSum{
    static void targetSum(int[] a,int target){
        for (int i = 0; i < a.length; i++) {
          int sum = 0;
          for(int j = i;j<a.length;j++){
            sum +=a[j];
            if(sum==target){
                System.out.println("index:"+i+ " to "+"index:"+j);
            }
          }
        }
    }
    public static void main(String[] args) {
        int[] a = {1,4,2,9,5,6};
        int target = 20;
        targetSum(a, target);
    }
}