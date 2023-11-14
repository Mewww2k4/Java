

import java.util.Scanner;

class Student {
  public int id;
  public String name;
  public double gpa;

  public Student(String string) {
  }

  public Student() {
  }

  //method
  public void input() {
    Scanner sc = new Scanner(System.in);
    System.out.print("\nNhap id: ");
    this.id = sc.nextInt();
    sc.nextLine();
    System.out.print("Nhap ten: ");
    this.name = sc.nextLine();
    System.out.print("Nhap GPA: ");
    this.gpa = sc.nextInt();
    
  }

  public void output() {
    System.out.print("\nID : " + this.id + " " + " Name :" + this.name+ " GPA: "+ this.gpa);
  }

  public String getStudentId() {
    return null;
  }
}

class StudentList {
   void input(Student st[]) {
    Scanner obj = new Scanner(System.in);
    for (int i = 0; i < st.length; i++) {
      System.out.print("\nSinh vien thu " + (i + 1));
      st[i] = new Student();
      st[i].input();
    }
  }

   void output(Student st[]) {
    System.out.print("\nDanh sach sinh vien\n");
    for (int i = 0; i < st.length; i++) {
      st[i].output();
    }
  }
  //ham sap xep giam dan theo id 
  void Sortdecerese(Student st[])
  {
    for (int i = 0; i < st.length - 1; i++) {
      for (int j = i + 1; j < st.length; j++) {
        if (st[i].id < st[j].id) {
          Student temp = st[i];
          st[i]= st[j];
          st[j]= temp;
        }
      }
    }
  }
  // hien thi sv co id cao nhat/ thap nhat 
  void maxminID(Student st[])
  {
    Student max = st[0];
    Student min = st[0];
    for(int i = 1 ; i < st.length; i++)
    {
      if (max.id < st[i].id) {
        max.id = st[i].id;
      }
      if (min.id > st[i].id) {
        min = st[i];
      }
    }
    System.out.print("\nSinh vien co ID cao nhat");
    max.output();
    System.out.print("\nSinh vien co ID thap nhat");
    min.output();
  //  System.out.println("ID thap nhat : " min);
   }
}
public class Hm {
   public static void main(String[] args) {
     Student st[] = new Student[3];
    //  st.input();
    //  st.output();
     StudentList list = new StudentList();
     list.input(st);
     list.output(st);
     System.out.println("\n-----------Mang sau khi sap xep giam---------");
     list.Sortdecerese(st);
     list.output(st);
     list.maxminID(st);
    
   }
}
