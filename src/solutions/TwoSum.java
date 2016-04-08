package solutions;
public class TwoSum {
	public int[] twoSum(int[] nums, int target){
		//Loop through each element in the whole input array "nums"
		for(int i=0; i<nums.length-1;i++){
			//Loop through elements other than the current element in the outer loop
			for(int j=i+1; j<nums.length;j++){
				//Check if the two elements sum up to target.
				if(nums[i]+nums[j]==target){
					//return result
					return new int[]{i,j};
				}
			}
		}
		//if no matches are found
		return null;
	}
}
