package Loop;

import java.util.Scanner;

public class bai2 {
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhap n : ");
    int n = sc.nextInt();
    int gt = 1;
    int sum = 0;
    for (int i = 1; i <= n; i++)
    {
      gt *= i;
      sum += gt;
    }
    System.out.println("Tong giai thua 1! "+ n + "! = " + sum);
    sc.close();
  }
}