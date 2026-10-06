class Solution {
    public int[] getConcatenation(int[] nums) {
        int l = nums.length, i = 0, j = 0, ct = 0;
        int[] ans = new int[2*l];
        while(j < 2*l && ct <= 1)
        {
            ans[j] = nums[i];
            i++;
            j++;
            if(i == l) 
            {
                i = 0;
                ct++;
            }
        }
        return ans;
    }
}