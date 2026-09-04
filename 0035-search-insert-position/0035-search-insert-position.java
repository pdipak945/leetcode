class Solution {
    public int searchInsert(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length-1);
    }

    public int binarySearch(int[] nums, int target, int first, int last){
        if(first > last){
            return first;
        }

        int mid = first + (last - first ) / 2;

        // System.out.println(first+" "+last+" "+mid);

        if(nums[mid] == target){
            return mid;
        } else if (nums[mid] < target ){
            return binarySearch(nums, target, mid+1, last);
        } else {
            return binarySearch(nums, target, first, mid-1);
        }

    }
}