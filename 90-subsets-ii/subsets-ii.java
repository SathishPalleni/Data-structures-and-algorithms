class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
            Arrays.sort(nums);
            List<List<Integer>> answer  = new ArrayList<>();
            List<Integer> helper = new ArrayList<>();
            Calculate(answer, nums, helper,0);
            return answer;
    }
            public static void Calculate(List<List<Integer>> answer, int nums[], List<Integer> helper, int i){
                if(i == nums.length){
                    answer.add(new ArrayList<>(helper));
                    return ;
                }
                helper.add(nums[i]);
                Calculate(answer, nums,helper, i+1);
                helper.remove(helper.size() -1);
                int idx = i+1;
                while(idx <nums.length && nums[idx] == nums[idx-1]){
                    idx++;
                }
                Calculate(answer, nums, helper, idx);
    }
}