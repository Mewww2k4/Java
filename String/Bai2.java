import java.util.Scanner;

public class Bai2 {
    private static String str1;

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Viet chuoi : ");
        String str = sc.nextLine();
        if(!str.isEmpty())
        {
            String str1 = str.substring(0,1).toUpperCase() + str.substring(1);
            System.out.print("Chuoi sau khi viet hoa ki tu dau tien : " + str1);
        }
        else
        {
          System.out.print("Chuoi rong");
        }
            String str2 = str1.replaceAll(" ","");
        System.out.print("Chuoi sau  khi xoa khoa trang : " + str2);
        sc.close();
    }
}
