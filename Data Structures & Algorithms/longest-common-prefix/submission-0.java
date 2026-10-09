class Solution {
    public String longestCommonPrefix(String[] strs) {
        int l = strs.length;
        Arrays.sort(strs);
        int end = Math.min(strs[0].length(), strs[l - 1].length());
        int i = 0;
        while(i < end && strs[0].charAt(i) == strs[l - 1].charAt(i))
            i++;
        return strs[0].substring(0, i);
    }
}