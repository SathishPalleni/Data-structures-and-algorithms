class Solution {
    public int lengthOfLongestSubstring(String s) {
      HashSet<Character> charset = new HashSet<>();
      int maxlength = 0;
      int left = 0;
      for(int right =0; right < s.length(); right ++){
       char  current = s.charAt(right);
       while(charset.contains(current)){
        charset.remove(s.charAt(left));
        left++;
       }
       charset.add(current);
       maxlength = Math.max(maxlength, right-left+1);

      }
      return maxlength;
    }
}