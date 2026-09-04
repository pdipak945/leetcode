class Solution {
    public int firstStableIndex(int[] nums, int k) {
        //precompute minimums from right to left
        int[] running = computeSuffixMins(nums);

        int prefixMax = Integer.MIN_VALUE;
        //iterate from left to right tracking the maximum
        for(int i=0; i<nums.length; i++){
            prefixMax = Math.max(prefixMax, nums[i]);

            if( prefixMax - running[i] <= k ){
                return i;
            }
        }

        return -1;
    }

    public int[] computeSuffixMins(int[] nums){
        int[] runningMinArray = new int[nums.length];
        
        int suffixMin = Integer.MAX_VALUE;
        
        for(int i=nums.length-1; i>=0; i--){
            suffixMin = Math.min(suffixMin, nums[i]);
            runningMinArray[i] = suffixMin;
        }

        return runningMinArray;
    }
}