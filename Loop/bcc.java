package Loop;

import java.util.Scanner;

public class bcc {
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int result = 0;
    for(int i =1 ; i <= n ; i++)
    {
      System.out.print("***Bang cuu chuong " + i + "***\n");
      for(int j = 1; j <= 10; j ++)
      {
        result = i*j;
        System.out.println("\t" + i + " x " + j + " = " + result);

      } 
      System.out.print("\n");
    } 
    sc.close();
  }
  
}
