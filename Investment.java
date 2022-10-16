//Write a program that reads an initial investment balance and an interest rate, then prints the number of years
// it takes for the investment to reach one million dollars.
public class Investment {
    private int balance ,interest ,rate,years;
    public Investment(int initial_balance, int initial_rate)
    {
        balance=initial_balance;
        rate=initial_rate;
    }
    public void no_years()
    {
      for(int i=1;balance<=1000000;i++)
      {
          interest=balance*rate/100;
          balance=balance+interest;
          years++;
      }
        System.out.println(years);
    }
    public void get_balance()
    {
        System.out.println(balance);
    }
}
