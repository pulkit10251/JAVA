package LEETCODE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class t3Sum {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> ans = threeSum(nums);
        for(int i = 0; i < ans.size(); i++){
            for (int j = 0; j < ans.get(i).size(); j++){
                System.out.print(ans.get(i).get(j) + "  ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 2; i++){
            if(i == 0 || nums[i] != nums[i - 1]){
                int lo = i+1;
                int hi = nums.length - 1;
                int sum = -1 * nums[i];

                while(lo < hi){
                    if(nums[lo] + nums[hi] == sum){
                        res.add(Arrays.asList(nums[i], nums[lo], nums[hi]));

                        while(lo < hi && nums[lo] == nums[lo+1])
                            lo++;
                        while(lo < hi && nums[hi] == nums[hi-1])
                            hi--;

                        lo++;
                        hi--;
                    }else if(nums[lo] + nums[hi] < sum){
                        lo++;
                    }else{
                        hi--;
                    }
                }
            }
        }

        return res;

    }
}
