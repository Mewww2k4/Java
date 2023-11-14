package Constructor;

/**
 * Date
 */
public class Date {
  private int date;
  private int month;
  private int year;

  public Date() {
    
  }

  public Date(int date, int month, int year)
  {
    this.date = date;
    this.month = month;
    this.year = year;
  }

  public void printDate()
  {
    System.out.println("Date : " + this.date);
  }
  
  public void printMonth() {
    System.out.println("Date : " + this.month);
  }
  
  public void printYear() {
    System.out.println("Date : " + this.year);
  }

  public void printDay() {
    System.out.println("Date : " + this.date + "/" + this.month + "/" + this.year);
  }

  public static void main(String args[])
  {
    Date d1 = new Date();
    d1.printDate();
    d1.printMonth();
    d1.printYear();
    Date d2 = new Date(10, 2, 2004);
    d2.printDay();
    }
  }
  
