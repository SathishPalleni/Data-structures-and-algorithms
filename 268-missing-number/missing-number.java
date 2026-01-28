class Solution {
    public int missingNumber(int[] nums) {
      /* int n = nums.length;
        int Tsum = (n * (n + 1)) / 2;
        int actualSum = Arrays.stream(nums).sum();
        return Tsum - actualSum;
        */
       int n = nums.length;
       int sum =0;
       for(int i =0; i<n; i++){
        sum = sum+nums[i];
       }
       int totalsum = (n*(n+1))/2;
       int missingnumner = totalsum - sum;
       return missingnumner;
    
    }
}