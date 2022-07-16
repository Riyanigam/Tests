class Solution {
    public double average(int[] salary) {
        double s = 0, avg = 0;
        Arrays.sort(salary);
        int n=salary.length;
        for(int i=1; i<n-1; i++)
        {
            s+=salary[i];
        }
        avg = s/(n-2);
        return avg;
    }
}