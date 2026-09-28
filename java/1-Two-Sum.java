class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        for(int i = 0; i < nums.length; i++){
             for(int j = i + 1; j < nums.length; j++){  // you may not use the same element twice that's why it started at the index i + 1
                 if(nums[i] + nums[j] == target){       
                     return new int[]{i, j};
                }
            }
        }
        return null;     
    }
}
