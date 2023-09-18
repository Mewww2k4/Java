package Loop;
import java.util.Scanner;

public class bai1 {
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhap n : ");
    int n = sc.nextInt();
    int s = 0;
    for (int i = 0; i <= n; i++)
    {
      s += 2 * i;
    }
    System.out.println("Tong la : " + s);
    sc.close();
  }
}
