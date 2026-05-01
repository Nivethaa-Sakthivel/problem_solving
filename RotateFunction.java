class Solution {
    public int maxRotateFunction(int[] nums) {
        int sum=0,F=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            F+=i*nums[i];
        }
        int max=F;
        for(int i=1;i<nums.length;i++){
            F+=sum-nums.length*nums[nums.length-i];
            max=Math. max(max,F);
        }
        return max;
    }
}
