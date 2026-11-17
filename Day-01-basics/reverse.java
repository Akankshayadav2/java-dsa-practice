class reverse
{
    public static void main(String[]args)
    {
        int rev=0;
        int n= 1333;
        while(n>0)
        {
            int d = n%10;
            rev = rev*10+d;
            n=n/10;
        }
        System.err.println(rev);
    }
}