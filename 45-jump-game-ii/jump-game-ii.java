class Solution {
    public int jump(int[] nums) {
      int jumps = 0;
      int farthest = 0;
      int currentEnd = 0;
        int n = nums.length-1;
        for(int i =0; i<n; i++){
            farthest = Math.max(farthest, nums[i]+i);
            if(i == currentEnd){
                jumps++;
                currentEnd = farthest;
            }
        }
        return jumps;
    }
}