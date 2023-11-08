import java.util.*;
import java.lang.Math;
public class HomeWork {
  //Ham nhap
  public static void input(int a[])
  {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < a.length; i++) {
      System.out.print("Nhap mang a["+i+"] = ");
      a[i] = sc.nextInt();
    }
  }
  //Ham xuat
  public static void output(int a[]) {
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i] + " ");
    }
  }
  //Ham tang dan
  public static void increase(int a[])
  {
    System.out.print("\nMang tang dan : ");
    for (int i = 0; i < a.length - 1; i++) {
      for (int j = i + 1; j < a.length; j++) {
        if (a[i] > a[j]) {
          int temp = a[i];
          a[i] = a[j];
          a[j] = temp;
        }
      }
    }
  }
  //Ham giam dan
  public static void decrease(int a[]) {
    System.out.print("\nMang giam dan: ");
    for (int i = 0; i < a.length - 1; i++) {
      for (int j = i + 1; j < a.length; j++) {
        if (a[i] < a[j]) {
          int temp = a[i];
          a[i] = a[j];
          a[j] = temp;
        }
      }
    }
  }
  //Ham kiem tra so chinh phuong
  public static boolean KtrSCP(int n) {
    if (n <= 0) {
      return false;
    }
    int sqrt = (int) Math.sqrt(n);
    return sqrt * sqrt == n;
  }
  public static boolean checkSCP(int a[])
  {
    for (int i = 0; i < a.length; i++) 
      if (!KtrSCP(a[i]))
      
        return false;
    
    return true;
  }
  //Di chuyen so chinh phuong len dau
  public static void MoveSCP(int a[])
  {
    System.out.print("\nMang sau khi dao so chinh phuong len dau: ");
    int moveindex = 0;
    for(int i = 0 ; i < a.length; i++)
    if(KtrSCP(a[i]))
    {
      int temp = a[i];
      a[i] = a[moveindex];
      a[moveindex] = temp;
       moveindex++;
    }
  }
  //Kiem tra so hoan chinh
  public static boolean sohoanhao(int n)
  {
    if (n <= 1) {
      return false;
    }
    int sum = 1;
    for (int i = 2; i * i <= n; i++) {
      if (n % i == 0) {
        sum += i;
        if (i != n / i) {
          sum += n / i;
        }
      }
    }
    return sum == n;
  }

  public static void tachmang(int a[], int b[], int c[])
  {
    int nb = 0;
    int nc = 0;
    for(int i = 0 ; i < a.length; i++)
    {
      if (sohoanhao(a[i])==true) {
        b[nb] = a[i]; //Luu so hoan hao vao mang B[];
        nb++;
      } else {
        c[nc] = a[i]; //Luu cac so khong hoan hao vao mang C[];
        nc++;
      }
    }
    System.out.print("\nMang la cac so hoan hao: ");
    for(int i = 0 ; i < nb ; i++)
    {
      System.out.print(b[i] + " ");
    }
    System.out.println();
    System.out.print("\nMang la cac so khong hoan hao: ");
    for (int i = 0; i < nc; i++) {
      System.out.print(c[i] + " ");
    }
    System.out.println();
    System.out.print("\nMang la cac so hoan hao co " + nb + " phan tu");
    System.out.print("\nMang la cac so khong hoan hao co " + nc + " phan tu");

  }

  public static void main(String[] args) {
    int[] a = new int[5];
    int[] b = new int[5];
    int[] c = new int[5];
    input(a);
    output(a);
    increase(a);
    output(a);
    decrease(a);
    output(a);
    MoveSCP(a);
    System.out.println(Arrays.toString(a));
    if(checkSCP(a))
    {
      System.out.print("\nMang la cac so chinh phuong");
    } else {
      System.out.print("\nMang khong la cac so chinh phuong");
    }
    tachmang(a, b, c);
  }
}
