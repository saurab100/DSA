class Solution {
    public int substrCount(String s, int k) {
        // code here
        int n = s.length();
        if (k > n || k <= 1) return 0;

        int[] freq = new int[26];
        int distinct = 0, i = 0, j = 0, ans = 0;

        while (j < n) {
            int idx = s.charAt(j) - 'a';
            if (freq[idx]++ == 0) distinct++;

            if (j - i + 1 == k) {
                if (distinct == k - 1) ans++;

                int leftIdx = s.charAt(i) - 'a';
                if (--freq[leftIdx] == 0) distinct--;
                i++;
            }
            j++;
        }
        return ans;
    }
}