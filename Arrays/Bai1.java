

import java.util.Scanner;

public class Bai1 {
  public static void input(int a[]) {
    Scanner newsc = new Scanner(System.in);
    for (int i = 0; i < a.length; i++) {
      System.out.print("Nhap mang a[" + i + "]= ");
      a[i] = newsc.nextInt();
    }
  }

  public static void output(int a[]) {
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i] + " ");
    }
  }

  public static void max(int a[]) {
    int max = a[0];
    int k = 0;
    for (int i = 0; i < a.length; i++) {
      if (max < a[i]) {
        max = a[i];
        k = i;
      }
    }
    System.out.println("\nPhan tu lon nhat la " + max + " tai vi tri " + k);
  }

  public static void increase(int a[]) {
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

  public static void decrease(int a[]) {
    System.out.print("\nMang giam dan : ");
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

  public static boolean ktSNT(int n) {
    if (n < 2) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static boolean check(int a[]) {
    for (int i = 2; i <= a.length; i++) {
      if (ktSNT(a[i]) == false) {
        return false;
      }
    }
    return true;
  }

  public static void tachghep(int a[], int b[], int c[], int d[]) {
    int nb = 0;
    int nc = 0;
    int nd = 0;
    for (int i = 0; i < a.length; i++) {
      if (ktSNT(a[i]) == true) {
        b[nb] = a[i];
        nb++;
      } else {
        c[nc] = a[i];
        nc++;
      }
    }
    System.out.print("\nMang co cac so nguyen to :");
    for (int i = 0; i < nb; i++) {
      System.out.println(b[i] + " ");
    }
    System.out.println();
    System.out.print("\nMang khong co cac so nguyen to :");
    for (int i = 0; i < nc; i++) {
      System.out.println(c[i] + " ");
    }
    System.out.println();
    for (int i = 0; i < nb; i++) {
      d[nd] = b[i];
      nd++;
    }
    for (int i = 0; i < nc; i++) {
      d[nd] = c[i];
      nd++;
    }
    System.out.print("Mang sau khi ghep :");
    for (int i = 0; i < nd; i++) {
      System.out.println(d[i] + " ");
    }
  }

  public static void main(String[] args) {
    Scanner newsc = new Scanner(System.in);
    int[] a = new int[5];
    int[] a1 = new int[5];
    int[] a2 = new int[5];
    int[] a3 = new int[5];
    input(a);
    output(a);
    increase(a);
    output(a);
    decrease(a);
    output(a);
    max(a);
    if (check(a) == true) {
      System.out.println("La so nguyen to ");
    } else {
      System.out.println("Tat ca khong phai la so nguyen to");
      tachghep(a, a1, a2, a3);
    }
    newsc.close();
  }
}
