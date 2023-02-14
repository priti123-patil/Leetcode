class Solution {
    public String addBinary(String a, String b) {
        char[] arr1=a.toCharArray();
        char[] arr2=b.toCharArray();
        Stack<Integer> ans=new Stack<>();
        int carry=0;
        char ch1,ch2;
        int i=a.length()-1,j=b.length()-1;
        for(i=a.length()-1,j=b.length()-1; i>=0 && j >=0 ; i--,j--)
        {
            ch1 = a.charAt(i);
            ch2 = b.charAt(j);
            if(ch1=='1' && ch2== '1')
            {
                if(carry == 1)
                {
                    ans.push(1);
                }
                else
                {
                    ans.push(0);
                }
                System.out.println(0+carry);
                carry = 1;
                System.out.println("Case 1 i=1 j=1");
            }
            else if(ch1 == '0' && ch2 == '0')
            {
                if(carry == 1){
                    ans.push(1);
                    carry = 0;
                }
                else
                {
                    ans.push(0);
                }
                System.out.println("Case 2 i=0 j=0");
                System.out.println(0+carry);
            }
            else if(ch1 == '1' && ch2 == '0')
            {
                if(carry == 1){
                    ans.push(0);
                }
                else{
                    ans.push(1);
                }
                System.out.println("Case 3 i=1 j=0");
                System.out.println("carry is "+carry);
            }
            else
            {
                if(carry == 1){
                    ans.push(0);
                }
                else{
                    ans.push(1);
                } // i=0 j=1
                System.out.println("Case 4 i=0 j=1");
                System.out.println(1+carry);
            }
        }
        while(i >= 0)
        {
            System.out.println("in i loop");
            if(carry == 1 && a.charAt(i)=='1'){
                    ans.push(0);
            }
            else if(carry == 1 && a.charAt(i)=='0'){
                    ans.push(1);
                    carry = 0;
            }
            else{
                ans.push(a.charAt(i)-'0');
            }
            i--;
        }
        while(j>=0 )
        {
            System.out.println("in j loop");
            if(carry == 1 && b.charAt(j)=='1'){
                    ans.push(0);
            }
            else if(carry == 1 && b.charAt(j)=='0'){
                    ans.push(1);
                    carry = 0;
            }
            else{
                    ans.push(b.charAt(j)-'0');
            }
            j--;
        }
        if(carry == 1)
        {
            ans.push(1);
        }
        System.out.println(ans);
        String res="";
        System.out.println(ans.size());
        for(int p=0;i < ans.size()-1;p++){
            Integer k = ans.pop();
            res += k.toString();
        }
        return res;
    }
}