import java.util.*;

public class Equal01Subarrays {
    public static int countSubarrays(int[] nums) {
      
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                nums[i] = -1;
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); 

        int prefixSum = 0;
        int count = 0;

        for (int num : nums) {
            prefixSum += num;

            if (map.containsKey(prefixSum)) {
                count += map.get(prefixSum);
            }

            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 1, 0, 1, 1};
        System.out.println("Count of subarrays = " + countSubarrays(arr));
    }
}
