class Solution {
    public boolean rotateString(String s, String goal) {
   if(s.length() != goal.length()) {
    return false;
   }
   String result = s + s;
     return result.contains(goal);
     //bruteforce
  //for(int i =0; i< s.length(); i++){
   // String rotaed = s.substring(i) + s.substring(0,i);
   // if(rotaed.equals(goal)) 
   // return true;
 // }
 // return false;
    }
}