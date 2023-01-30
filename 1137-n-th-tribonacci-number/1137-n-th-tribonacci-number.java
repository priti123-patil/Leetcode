class Solution {
    public int tribonacci(int n) {
        int a=0;
        int b=1;
        int c=1;
        
        if(n==1 || n==2)  return 1;
        int prev_ans=0;
        for(int i=3;i<=n;i++)
        {
          prev_ans=a+b+c;
          a=b;
          b=c;
          c=prev_ans;
        }
        return prev_ans;
    }
}