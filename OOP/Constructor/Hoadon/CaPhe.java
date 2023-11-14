package Constructor.Hoadon;

public class CaPhe {
  private String tenCf;
  private double giaTien;
  private double khoiluong;

  public CaPhe(String cf, double cost, double kl)
  {
    this.tenCf = cf;
    this.giaTien = cost;
    this.khoiluong = kl;
  }

  public double SumMoney()
  {
    return (this.giaTien * this.khoiluong);
  }

  public boolean CheckKL(double kl)
  {
    return this.khoiluong > kl;
  }

  public boolean ChecksumMOney()
  {
    return this.SumMoney() > 500000;
  }

  public double fixCost(double x) {
    if (this.SumMoney() > 500000)
      return ((100-x)/ 100) * this.SumMoney();
    return 0;
  }

  public double giasaukhigiam(double x)
  {
    return this.SumMoney() - this.fixCost(x);
  }
}
