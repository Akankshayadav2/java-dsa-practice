
import java.util.Scanner;

 class SumOfN
 {
  public static void main (String[]args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the number =");
    int n = sc.nextInt();
    int sum =0;
    for(int i=0;i<=n;i++)
    {
      sum+=i;
    }
    System.out.print(sum + " ");
  }
 }