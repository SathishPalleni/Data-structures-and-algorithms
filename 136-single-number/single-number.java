class Solution {
    public int singleNumber(int[] nums) {
        //if(nums = 0) return nums
    //    Arrays.sort(nums); 
    //     for(int i =0; i<nums.length-1; i++){
    //         if(nums[i] != nums[i+1]){
    //         return nums[i];
    //         }
    //     }
    //     return nums[nums.length-1];

    // int result =0;
    // for(int i : nums){
    //     result = result^i;
    // }
    // return result;
    HashSet<Integer> s = new HashSet<Integer>();
    for( int i : nums){
        if(s.contains(i)){
            s.remove(i);
        }else{
            s.add(i);
        }
    }
    for(int i : s){
        return i;
    }
    return -1;
    }
}