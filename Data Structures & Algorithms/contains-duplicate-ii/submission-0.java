class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int i = 0, j = 1, n = nums.length;
        while(i < n - 1)
        {
            j = i + 1;
            while(j < n)
            {
                if(nums[i] == nums[j] && j - i <= k) return true;
                else j++;
            }
            i++;
        }
        return false;
    }
}