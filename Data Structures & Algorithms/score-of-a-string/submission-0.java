class Solution {
    public int scoreOfString(String s) {
        int i = 0, j = 1, n = s.length(), sum = 0;
        while(i < n - 1 && j < n)
        {
            sum += Math.abs((int)(s.charAt(j)) - (int)(s.charAt(i)));
            i++;
            j++;
        }
        return sum;
    }
}