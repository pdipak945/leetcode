class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int[] running = getReverseMinArray(nums);

        int max = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            max = Math.max(max, nums[i]);
            if( max-running[i] <=k){
                return i;
            }
        }

        return -1;
    }

    public int[] getReverseMinArray(int[] nums){
        int[] runningMinArray = new int[nums.length];
        
        int min = Integer.MAX_VALUE;
        
        for(int i=nums.length-1; i>=0; i--){
            min = Math.min(min, nums[i]);
            runningMinArray[i] = min;
        }

        return runningMinArray;
    }
}