//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    int m=sc.nextInt();
		    Solution ob = new Solution();
		    System.out.println(ob.findPages(a,n,m));
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution 
{
    //Function to find minimum number of pages.
    public static int findPages(int[]A,int N,int M)
    {
        if(M > N)
        {
            return -1;
        }
        int min=0;
        int total=0;
        int mid=0;
        for(int i=0;i<N;i++)
        {
            if(A[i]<min)
            {
                min = A[i];
            }
            total += A[i];
        }
        int low=min;
        int high=total;
        int res=0;
        while(low <= high)
        {
            mid=low+(high-low)/2;
            
            if(isPossible(A,mid,M))
            {
                res=mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return res;
    }
    
    public static boolean isPossible(int[] arr , int cap , int M)
    {
        int alloSt=1;
        int pages=0;
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>cap)
            {
                return false;
            }
            if(pages + arr[i] > cap)
            {
                alloSt += 1;
                pages = arr[i];
            }
            else
            {
                pages+=arr[i];
            }
        }
        if(alloSt > M)
        {
            return false;
        }
        return true;
    }
};