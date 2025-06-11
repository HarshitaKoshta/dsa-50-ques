public class TwoSumII {
    public static void main(String[] args) {
        int[] num = {1,4,6,8,9,19};
        int target =13;
        int[] ans  =new int[2];
        int st =0,ed = num.length-1;

        System.out.println("target sum found at ");
        while(st<=ed){
           int sum = num[st]+num[ed];

           if(sum==target){
            ans[0]= st+1;
            ans[1]= ed +1;
            for(int i:ans){
            System.out.print(i+" ");
            }
            break;
           }else if(sum>target){
            ed--;
           }else{
            st++;
           }
        } 
    }
}
