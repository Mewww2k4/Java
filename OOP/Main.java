

public class Main {
  // File: Main.java
    public static void main(String[] args) {
      // Sử dụng các class đã định nghĩa
      Person person = new Person("John", 25);
      System.out.println("Name: " + person.getName());
      System.out.println("Age: " + person.getAge());

      Student student = new Student("S12345");
      System.out.println("Student ID: " + student.getStudentId());
    }
  }
  
