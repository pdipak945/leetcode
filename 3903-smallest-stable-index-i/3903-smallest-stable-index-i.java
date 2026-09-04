class Solution {
    		public int firstStableIndex(int[] nums, int k)
		{
		    //the max 
		    int max[] = new int[nums.length];
		    int min[] = new int[nums.length];
		    
		    
		    int greate=-1;
		    for(int i = 0 ; i < nums.length ; i++)
		    {
		        if(nums[i] > greate)
		            greate = nums[i];
		        max[i] = greate;
		    }
		    int small = Integer.MAX_VALUE;
		    for(int i = nums.length-1 ; i >=0 ; i--)
		    {
		     if(nums[i] < small)
		         small = nums[i];
		         
		      min[i]= small;
		    }
		    
		    for(int i = 0 ; i < nums.length ; i++)
		    {
		        if(max[i]-min[i] <= k)
		            return i;
		    }
		    
		    return -1;
		    
		    
		    
		}
}