import java.util.*;
class Solution{
    static boolean isPalindrome(int a){
        StringBuffer s=new StringBuffer(Integer.toString(a));
        if(s.reverse().toString().equals(Integer.toString(a)))
            return true;
        return false;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();   
        }
        for(int i=0;i<n;i++)
        {
            t:for(int j=arr[i]-1;j>0;j--)
            {
                if(isPalindrome(j))
                {
                    System.out.println(j);
                    break t;
                }
            }
        }
        sc.close();
    }

}
