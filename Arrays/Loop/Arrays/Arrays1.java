package Loop.Arrays;
import java.util.Scanner;

public class Arrays1 {
  public static void Input(int[] a, int n) {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < n; i++) {
      System.out.print("Nhap mang a[" + i + "] = ");
      a[i] = sc.nextInt();
    }
  }

  public static void Output(int[] a, int n) {
    for (int i = 0; i < n; i++) {
      System.out.print(a[i] + "  ");
    }
  }

  public static void increase(int[] a, int n) {
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if (a[i] > a[j]) {
          int temp = a[i];
          a[i] = a[j];
          a[j] = temp;
        }
      }
    }
  }

  public static void decrease(int[] a, int n) {
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if (a[i] < a[j]) {
          int temp = a[i];
          a[i] = a[j];
          a[j] = temp;
        }
      }
    }
  }

  public static void addelement(int[] a, int n)
  {
    
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = 0;
    int[] a = new int[100];
    boolean continueProgram = true;

    while (continueProgram) {
      System.out.println("********************MENU********************");
      System.out.println("*  1. Nhap mang so nguyen.                 *");
      System.out.println("*  2. Xuat mang so nguyen.                 *");
      System.out.println("*  3. Mang theo thu tu tang dan.           *");
      System.out.println("*  4. Mang theo thu tu giam dan.           *");
      System.out.println("*  5. Mang chen phan tu vao vi tri x.      *");
      System.out.println("*  0. Thoat.                               *");
      System.out.println("********************************************");

      int choose = -1;
      while (choose < 0 || choose > 5) {
        System.out.print("Nhap lua chon : ");
        choose = sc.nextInt();
        if (choose < 0 || choose > 5) {
          System.out.println("Vui long nhap lai!!!");
        }
      }

      switch (choose) {
        case 1:
          System.out.print("Nhap n : ");
          n = sc.nextInt();
          Input(a, n);
          break;
        case 2:
          System.out.print("\nMang sau khi nhap : ");
          Output(a, n);
          break;
        case 3:
          increase(a, n);
          Output(a, n);
          break;
        case 4:
          decrease(a, n);
          Output(a, n);
          break;
        case 0:
          continueProgram = false;
          break;
        default:
        System.out.println("Khong hop le!!!");
          break;
      }

      if (continueProgram) {
        System.out.print("\nBan co muon tiep tuc (Y/N)? ");
        String choice = sc.next();
        if (choice == "Y") {
          continueProgram = true;
        }
      }
    }
    
    sc.close(); // Đóng Scanner sau khi đã hoàn thành tất cả thao tác với Scanner
    System.out.println("Ket thuc chuong trinh.");
  }
}
