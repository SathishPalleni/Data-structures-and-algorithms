class Solution {
   public int longestCommonPrefix(int[] arr1, int[] arr2) {
	HashSet<Integer> set = new HashSet<>();
    for(int i =0; i<arr1.length; i++){
        int num = arr1[i];
        while(num != 0){
            set.add(num);
            num = num/10;
        }
    }
    int answer =0;
    for(int i =0; i<arr2.length; i++){
        int num = arr2[i];
        while(num!=0){
            if(set.contains(num)){
                int digits = (int)(Math.log(num)/Math.log(10)) +1;
                answer = Math.max(answer,digits);
                break;
            }
            num = num/10;
        }
    }
    return answer;
}
}