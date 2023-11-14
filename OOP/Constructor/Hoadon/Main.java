package Constructor.Hoadon;

public class Main {
  public static void main(String[] args) {
    CaPhe hd = new CaPhe("TrungNguyen", 100000, 5.7);
    System.out.println("Tong gia Tien H1: " + hd.SumMoney());
    System.out.println("Kiem tra khoii luong > 2kg is " + hd.CheckKL(2));
    System.out.println("Tong tien lon hon 500k " + hd.ChecksumMOney());
    System.out.println("Hoa don giam : " + hd.fixCost(10));
    System.out.println("Hoa don sau khi giam gia : " + hd.giasaukhigiam(10));
    CaPhe hd2 = new CaPhe("TrungNguyen", 1000, 1.7);
    System.out.println("Hoa don giam : " + hd2.fixCost(10));
  }
}
