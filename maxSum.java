//kadane's Algorithm-It is used to find the maximum subarray sum

class MaxSum{
	public static int subArraySum(int[] nums)
	{
	int currentSum=arr[0];
	int maxSum=arr[0];
	for(int i=1;i<nums.length;i++)
	{
	maxSum=Math.max(maxSum+nums[i],nums[i]);
	currentSum=Math.max(currentSum,maxSum);
	}
      return currentSum;
     }
}



