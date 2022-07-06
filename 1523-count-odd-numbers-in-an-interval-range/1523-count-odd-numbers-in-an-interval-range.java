class Solution {
    static int countOdds(int low, int high) {
    int N = (high - low)/2;
        if(high%2!=0||low%2!=0)
            N++;
            return N;
    }
     public static void main(String args[])
    {
        int low = 3, high = 7;
        System.out.println(countOdds(low,high));
    }
}