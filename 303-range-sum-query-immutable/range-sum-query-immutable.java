class NumArray {
    int[] preComp;

    public NumArray(int[] nums) {
        int n = nums.length;
        preComp = new int[n + 1];

        for(int i=1; i<=n; i++){
            preComp[i]= preComp[i-1] + nums[i-1];
        }
    }

    public int sumRange(int left, int right) {
        if(left==0) return preComp[right+1];

        return (preComp[right+1] - preComp[left]);
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */