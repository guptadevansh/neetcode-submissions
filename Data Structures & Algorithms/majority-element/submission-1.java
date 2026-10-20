class Solution {
    public int majorityElement(int[] nums) {
        int n = 0, ct = 0;
        for(int num: nums)
        {
            if(ct == 0)
            { 
                n = num;
                ct = 1;
            }
            else if(num == n) ct++;
            else ct--;
        }
        return n;
    }
}