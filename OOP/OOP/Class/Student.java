package OOP.Class;
import java.util.Scanner;

public class Student {
    String name;
    int age;
    String address;

    public Student(String name, int age, String address) {
      this.name = name;
      this.age = age;
      this.address = address;
    }

    public Student()
    {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getAddress() {
      return this.address;
    }

    public void Input()
    {
      Scanner sc = new Scanner(System.in);
      System.out.print("Nhap ho va ten : ");
      String name = sc.nextLine();
      System.out.print("Nhap tuoi: ");
      int age = sc.nextInt();
      sc.nextLine();
      System.out.print("Nhap dia chi: ");
      String address = sc.nextLine();
      //set
      this.setName(name);
      this.setAge(age);
      this.setAddress(address);
    }

    public void Output()
    {
      System.out.print("Ho Ten : " + this.getName()+", Tuoi : "+this.getAge()+", Dia chi : "+this.getAddress()) ;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", address=" + address + "]";
    }

    public static void main(String[] args) {
        Student st1 = new Student("Trinh", 18, "Quang Nam");
        Student st2 = new Student();
        System.out.println(st1); // This will call the toString() method
        st2.Input();
        st2.Output();

    }
}
