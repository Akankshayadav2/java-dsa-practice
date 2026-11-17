class sumOfDigits
{
    public static void main(String[] args) {
        int sum =0;
        int n =1234;
        while(n>0)
        {
        int digits=n%10;
        sum=sum+digits;
        n=n/10;
        }
        System.out.print(sum);
    }
}