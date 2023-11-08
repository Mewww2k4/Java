import java.util.Scanner;
import java.lang.Math;

public class bai1 {
  private static final float M_Pi = 0;

  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input Area : ");
    double s = sc.nextInt();
    double r = Math.sqrt(s / 4 * Math.PI);
    double v = (float) 4 * Math.PI * Math.pow(r, 3) / 3.0;
    System.out.println("Area rectangle : " + v);
    sc.close();
  }

}
