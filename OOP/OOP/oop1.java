package OOP;
public class oop1 {
  public static void main(String[] args)
  {
    System.out.println("hello world");
    User u = new User();
    u.name = "Trinh";
    u.member = "Thuy Trinh";


    User u2 = new User();
    u2.name = "Thuy Trinh";
    u2.member = "Nguyen Thi";
    System.out.println(u.name);
    System.err.println(u2.name);
    System.out.println(u.age);
  }
}
