package Loop;

import java.util.Scanner;

public class hcn {
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhap chieu rong : ");
    int r = sc.nextInt();
    System.out.print("Nhap chieu dai : ");
    int d = sc.nextInt();
    for (int i = 0; i < r; i++) {
      for (int j = 0; j < d; j++) {
        System.out.print("* ");
      }
      System.out.print("\n");
    }
    sc.close();
  }
}
