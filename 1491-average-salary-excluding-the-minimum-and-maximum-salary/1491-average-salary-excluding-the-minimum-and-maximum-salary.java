class Solution {
    public double average(int[] salary) {
        double s = 0, avg = 0;
        Arrays.sort(salary);
        for(int i=1; i<salary.length-1; i++)
        {
            s = s+salary[i];
        }
        avg = s/(salary.length-2);
        return avg;
    }
}