class Solution {
    public int numberOfSpecialChars(String word) {
        boolean[] low = new boolean[26];
        boolean[] up = new boolean[26];

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            // Lowercase character
            if (c >= 'a' && c <= 'z') {
                low[c - 'a'] = true;
            }
            // Uppercase character
            else {
                up[c - 'A'] = true;
            }
        }

        int ans = 0;

        // Count characters present in both
        for (int i = 0; i < 26; i++) {
            if (low[i] && up[i]) {
                ans++;
            }
        }

        return ans;
    }
}