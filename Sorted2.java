public class Sorted2 {
    public static void main(String[] args) {
        int[] a = {1,1,2,2,2,3,3,3,3};
        int i=0;
        for(int n:a){
            if(i<2||n>a[i-2]){
                a[i]=n;
                i++;
            }
        }
        System.out.println("The length of new array is:"+i);
    }
}
