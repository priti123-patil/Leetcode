class Solution {
    public int nextGreaterElement(int n) {
     
        char[] arr = (n + "").toCharArray();
        
        int i, j;
        
        for (i = arr.length-1; i > 0; i--)
            if (arr[i-1] < arr[i])
               break;

        if (i == 0)
            return -1;
            
        int x = arr[i-1], small = i;
        
        for (j = i+1; j < arr.length; j++)
            if (arr[j] > x && arr[j] <= arr[small])
                small = j;
        
        char temp = arr[i-1];
        
        arr[i-1] = arr[small];
        
        arr[small] = temp;
       
        Arrays.sort(arr, i, arr.length);
        
        long val = Long.parseLong(new String(arr));
        
        if(val <= Integer.MAX_VALUE)
            return (int) val; 
        else
            return -1;
        
    }
}