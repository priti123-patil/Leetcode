class Solution {
    public double average(int[] salary) {
        double totalSum=0;
        int min=salary[0],max=salary[0];
        for(int i:salary)
        {
            if(i<min)
            {
                min=i;
            }
            if(i>max)
            {
                max=i;
            }
            totalSum += i;
        }
        totalSum -= min;
        totalSum -= max;
    
        double ans = totalSum / (salary.length-2);
        return ans;
    }
}