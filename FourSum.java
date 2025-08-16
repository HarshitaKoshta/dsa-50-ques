
import java.util.*;

public class FourSum {
     public static List<List<Integer>> fourSum(int[] nums , int tar){
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        if(n<4) return ans;
        
      Arrays.sort(nums);
      for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;

      for (int j = i + 1; j < n; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
      
       int p = j + 1, q = n - 1;
       
       while (p < q) {
                    long sum = (long) nums[i] + (long) nums[j] + 
                               (long) nums[p] + (long) nums[q];

                    if (sum == tar) {
                        ans.add(Arrays.asList(nums[i], nums[j], nums[p], nums[q]));

                        int x = nums[p], y = nums[q];
                        while (p < q && nums[p] == x) p++;
                        while (p < q && nums[q] == y) q--;
                    } else if (sum < tar) {
                        p++;
                    } else {
                        q--;
       
                }
            }
      }    
     }
     return ans;
    }
    public static void main(String[] args) {
        int[] nums = {-2,-1,0,0,-1,2};
        int tar = 0;
        System.out.println(fourSum(nums, tar));
    }
}
