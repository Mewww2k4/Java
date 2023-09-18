package Loop;

import java.util.Scanner;

public class CalculateSum {
  public static void Bai1() // S= 1+2+3+...+n
  {
    Scanner sc1 = new Scanner(System.in);
    int n = sc1.nextInt();
    int s = 0;
    for (int i = 1; i <= n; i++) {
      s += i;
    }
    System.out.println("Tong la : " + s);
    sc1.close();
  }

  public static void main(String[] args) {
     Bai1();
  }
}