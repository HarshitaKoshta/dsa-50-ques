class ProductArrExceptSelf{
    public static void main(String[] args) {
        int[] a ={1,2,1,1,1};
        int idx=a[0];
        int product=1;
      
        for(int i =0; i<a.length; i++){
           product *=a[i];
        }
        for (int i = 0; i < a.length; i++) {
            int finalP = product/a[i];
            System.out.println("Product except self at index " + i + ":" + finalP);
        }

    }
}