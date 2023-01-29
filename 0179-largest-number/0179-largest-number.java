class Solution{
    public String largestNumber(int[] nums){
        //convert int array to string array
        //sort
        //string join
        //check if start with 0 return 0 else return res
        String[] res=new String[nums.length];
        int i=0;
        for(int ele:nums)
        {
            res[i] = String.valueOf(ele);
            i++;
        }
        Arrays.sort(res, (s1, s2) -> (s2+s1).compareTo(s1+s2));
        String num=new String();
        for(String ele:res)
        {
            num+=ele;
        }
        return num.startsWith("0") ? "0" :  num;
    }
}