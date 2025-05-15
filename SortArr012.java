class SortArr012{
    static void sortArr(int[] a){
     int c0=0,c1=0,c2=0;
     for(int i = 0;i<a.length;i++){
        if(a[i]==0){
            c0++;
        }else if(a[i]==1){
            c1++;
        }else c2++;
     }
      int idx =0;
     for (int i = 0; i <c0; i++) {
        a[idx++]=0;
     }
    for (int i = 0; i <c1; i++) {
        a[idx++]=1;
     }
      for (int i = 0; i <c2; i++) {
        a[idx++]=2;
     }
     System.out.println("sorted 0s,1s,2s:");
     for(int num:a){
        System.out.print(num+" ");
     }
    }
    public static void main(String[] args) {
        int[] a ={1,2,0,0,2,1,0,2};
        sortArr(a);
    }
}