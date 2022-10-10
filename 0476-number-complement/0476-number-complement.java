class Solution {
    public int findComplement(int num) {
       
        //Example:
        // 5-     101
        // mask-  111
        // 5 comp-010
        
        
        // logic when we xor any number with 1 then we get it's compliment 
        // so xor the num we require the length of a number 
        // after getting length we will create a mask of that length
        // ans then we will xor number and mask which will be our result
        
        
        int n=num;
        
        int len=0;
        
        while(n>0)
        {
            len++;
            n= n >> 1;
        }
        
        // length will be 3 for 5
        // 1<< (3)
        // 1000 
        // need to -1 to get the mask
        // (1000) - 1 = 111
        // 111 is our mask 
        //System.out.println(c);
        
        int mask = (1 << len) - 1;
        
        //System.out.println(mask);
        
        return num^mask;
       
    }
}