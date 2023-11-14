
public class Student1 {
    String firstname;
    String lastname;
    int age;
  
   //constructor no agrument > tao khong doi so 
   /*
    * public Student1() {
    * this.firstname = "Thuy";
    * this.lastname = "Trinh";
    * this.age = 19;
    * }
    */
   //constructor have agrument -> tao co doi so 
   public Student1(String firstname, String lastname, int age)
   {
     this.firstname = firstname;
     this.lastname = lastname;
     this.age = age;
   }

   public Student1()
   {

   }

  public static void main(String args[]) {
    Student1 st1 = new Student1();
    st1.firstname = "Trinh";
    st1.age = 20;
    Student1 st2 = new Student1("Thuy Trinh", " Nguyen Thi ", 19);
    
    System.out.println(st1.age);
    System.out.println(st2.age);
  }
}
  

