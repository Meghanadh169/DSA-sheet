class Solution {
    public int numberOfSubstrings(String s) {
        int[] freq = new int[3];

        int left = 0, res = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            freq[s.charAt(i) - 'a']++;

            while (freq[0] > 0 && freq[1] > 0 && freq[2] > 0) {
                res += n - i;
                freq[s.charAt(left) - 'a']--;
                left++;
            }
        }

        return res;
    }
}