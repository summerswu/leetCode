class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int current = 0;
        for(int i = 0; i < nums.length; i++) {
            current ++;
            if(nums[i] != 1){
               current = 0;
            }
            if(max<current){
                max = current;
            }
        } 
        return max;
    }
}