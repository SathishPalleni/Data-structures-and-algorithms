class Solution {
    public boolean canJump(int[] nums) {
        int ditances = 0;
        for(int i =0; i<nums.length; i++){
            if(i>ditances ) return false;
            ditances = Math.max(ditances, i+nums[i]);
        }
        return true;
    }
}