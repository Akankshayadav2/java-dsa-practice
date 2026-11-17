import java.util.Scanner;
class countDigits
{
 public static void main (String[]args)
 {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the n");
    int n = sc.nextInt();
    int count = 0;
    while(n>0)
    {
        n=n/10;
        count++;
    }
    
    System.out.print(count);
 }
}