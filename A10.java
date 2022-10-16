// Currency conversion. Write a program that first asks the user to type today’s price for one dollar in
// Japanese yen, then reads U.S. dollar values and converts each to yen. Use 0 as a sentinel
import java.util.Scanner;
public class A10 {
    public static void main(String[] args) {
        System.out.print("please type today's price for one dollar in japanese yen : ");
        Scanner in=new Scanner(System.in);
        double price=in.nextDouble();
        double money;
        do {
            System.out.println("enter amount of money that you want to convert : \t(enter 0 to exit)");
            money=in.nextDouble();
            if(money==0)break;
            double conversion=money*price;
            System.out.println(money+" dollars = "+conversion+" yens");
        } while(money!=0);

    }
}
