class palindrome
{
     public static void main(String[]args)
    {
        int rev=0;
        int n= 121;
        int ori = n;
        while(n>0)
        {
            int d = n%10;
            rev = rev*10+d;
            n=n/10;
        }
       if(rev==ori)
       {
        System.out.println("palindrome");
       }
       else{
 System.out.println(" not palindrome");
       }
    }
}