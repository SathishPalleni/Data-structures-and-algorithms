class Solution {
    public String reversePrefix(String word, char ch) {
      int index = word.indexOf(ch);

        if (index == -1) return word;

        String prefix = word.substring(0, index + 1);
        String rest = word.substring(index + 1);

        return new StringBuilder(prefix).reverse().append(rest).toString();
    }
}