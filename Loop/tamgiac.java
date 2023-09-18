package Loop;

import java.util.Scanner;

public class tamgiac {
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhap chieu cao : ");
    int h = sc.nextInt();
    for(int i = 0; i < h ; i++)
    {
      for (int j = 0; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.print("\n");
    }
    sc.close();
  }
  
}
