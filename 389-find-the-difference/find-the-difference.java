class Solution {
    public char findTheDifference(String s, String t) {
        char result = 0; // 1. Start with a "blank slate." We'll use this to store the difference. 0 in XOR means no change.
        for (char c : s.toCharArray()) { // 2. Loop through each character in the string 's'
            result ^= c; // 3.  "XOR" (Exclusive OR) each character in 's' with our 'result'.
                          //     XOR is a bitwise operation. If a bit is different, it's 1; if same, it's 0.
                          //     This clever trick will let us "cancel out" characters.
        }
        for (char c : t.toCharArray()) { // 4. Loop through each character in the string 't'
            result ^= c; // 5. "XOR" each character in 't' with the 'result'.  Again, characters that are in both strings will be "canceled" out because of XOR.
        }
        return result; // 6.  The 'result' now holds the character that was added!
    }
}