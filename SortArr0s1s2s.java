public class SortArr0s1s2s {
    
    public static void main(String[] args) {
        int[] arr = {1,0,0,2,0,1,2,1,1,2,0};

        int c0 = 0, c1 = 0, c2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                c0++;
            }else if(arr[i]==1){
                c1++;
            }else 
                c2++;
        }
        int idx =0;
        for (int i = 0; i < c0; i++) {
           arr[idx++] = 0;
        }
         for (int i = 0; i < c1; i++) {
           arr[idx++] = 1;
        }
         for (int i = 0; i < c2; i++) {
           arr[idx++] = 2;
        }
        for(int n :arr){
            System.out.println(n);
        }
    }
}
