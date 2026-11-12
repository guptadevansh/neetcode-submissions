class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;
        int i = 0, j = 0, ans = 1;
        Set<Character> w = new HashSet<Character>();
        while(j < s.length())
        {
            while(w.contains(s.charAt(j)))
            {
                w.remove(s.charAt(i));
                i++;
            }
            w.add(s.charAt(j));
            ans = Math.max(ans, j - i + 1);
            j++;
        }
        return ans;
    }
}
