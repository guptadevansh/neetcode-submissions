class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i1 = 0, i2 = 0, i3 = 0, l1 = word1.length(), l2 = word2.length();
        char[] ans = new char[l1 + l2];
        while(i1 < l1 && i2 < l2)
        {
            ans[i3++] = word1.charAt(i1++);
            ans[i3++] = word2.charAt(i2++);
        }
        while(i1 < l1)
        {
            ans[i3++] = word1.charAt(i1++);
        }
        while(i2 < l2)
        {
            ans[i3++] = word2.charAt(i2++);
        }
        return new String(ans);
    }
}