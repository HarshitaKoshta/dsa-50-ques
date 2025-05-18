class KadanesAlgo{
    static void MaxSum(int[] a){
        int currentMax = a[0];
        int maxSub = a[0];
      for (int i = 1; i < a.length; i++) {
        if(currentMax+a[i]>a[i]){
           currentMax = currentMax + a[i];
        }else{
            currentMax=a[i];
        }
        if(currentMax>maxSub){
            maxSub=currentMax;
        }
      }
      System.out.println(maxSub);
    }
    public static void main(String[] args) {
        int[] a = {1,8,-3,3,5,-2,4,3,-6};
        MaxSum(a);
    }
}