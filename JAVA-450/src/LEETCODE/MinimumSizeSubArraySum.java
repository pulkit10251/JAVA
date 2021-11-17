package LEETCODE;

public class MinimumSizeSubArraySum {
    public static void main(String[] args) {
        int target = 7;
        int[] arr = {2,3,1,2,4,3};

        System.out.println(minSubArrayLen(target, arr));
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int min  = Integer.MAX_VALUE;
        int i = 0, j = 0;
        int sum = 0;

        while(j < nums.length){

            sum += nums[j];
            if(sum < target){
                j++;
            }else if(sum == target){
                System.out.println(j-i+1);
                if(j - i +1 < min){
                    min = j - i +1;
                }
                j++;
            }else{
                while(sum > target) {
                    sum -= nums[i];
                    i++;
                }
                if(sum == target){
                    System.out.println(j-i+1);
                    if(j - i +1 < min){
                        min = j - i +1;
                    }
                }
                j++;
            }
        }
        return min;
    }
}
