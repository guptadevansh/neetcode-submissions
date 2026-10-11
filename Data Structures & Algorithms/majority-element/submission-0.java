class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length/2;
        Map<Integer, Integer> m = new HashMap<>();
        for(int num : nums)
        {
            m.put(num, m.getOrDefault(num, 0) + 1);
        }
        for(Map.Entry<Integer,Integer>entry : m.entrySet())
        {
            if(entry.getValue() > n)
                return entry.getKey();
        }
        return -1;
    }
}