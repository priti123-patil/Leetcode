class Solution {
    public String addBinary(String a, String b) {
        int ca=a.length();
		int cb=b.length();
		if(ca > cb)
		{
			int diff= ca-cb;
			for(int i=0;i<diff;i++)
			{
				b = "0" + b ;
			}
			return add( a , b );
		}
		else if( cb > ca )
		{
			int diff= cb-ca;
			for(int i=0;i<diff;i++)
			{
				a = "0" + a ;
			}
			return add( a , b );
		}
		return add(a,b);
    }
    
    static String add(String a,String b)
	{
		int i=a.length()-1;
		String ans="";
		int carry = 0;
		while(i >= 0 )
		{
			if(a.charAt(i)=='1' && b.charAt(i)=='1')
			{
				if(carry == 1)
				{
					ans = "1" + ans;
					carry = 1;
				}
				else
				{
					ans = "0" + ans ;
					carry = 1 ;
				}
			}
else if( (a.charAt(i)=='0' && b.charAt(i)=='1') || ( a.charAt(i)=='1' && b.charAt(i)=='0' )  )
			{
				if(carry == 1)
				{
					ans = "0" + ans;
					carry = 1;
				}
				else
				{
					ans = "1" + ans ;
				}
			}
			else if( a.charAt(i)=='0' && b.charAt(i)=='0')
			{
				if(carry == 1)
				{
					ans = "1" + ans ;
					carry = 0;
				}
				else
				{
					ans = "0" + ans ;
				}
			}
			i--;
		}
		if(carry == 1)
		{
			ans = "1" + ans ;
		}
		return ans;
	}
}