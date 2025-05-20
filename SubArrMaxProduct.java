class SubArrMaxProduct{
    static void maxProdut(int[] a){
        int maxP = -133;
      
       for(int i=0;i<a.length;i++){
         int currP = 1;
         for(int j = i;j<a.length;j++){
             currP *=a[j];
              maxP = Math.max(maxP, currP);
         }
       }
       System.out.println("max product is :"+maxP);
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,0,5,6};
        maxProdut(a);
    }
}