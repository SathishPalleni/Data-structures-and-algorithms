class Solution {
    public int[] decrypt(int[] code, int k) {
        
        int[] res = code.clone();
        for(int i = 0; i < code.length; i++) {

            int sum = 0;
            if(k > 0) {
                
                for(int j = i + 1; j <= i + k; j++) {

                    sum += code[j % code.length];
                }
            } else if(k < 0) {

                for(int j = i - 1; j > i - 1 + k; j--) {
                    sum += code[(j + code.length) % code.length];
                }
            }

            res[i] = sum;
        }

        return res;
    }
}