//Write programs with loops that compute  a. The sum of all even numbers between 2 and 100 (inclusive). b. The
// sum of all odd numbers between a and b (inclusive), where a and b are inputs.  c. The sum of all odd digits
// of an input. (For example, if the input is 32677, the sum would be 3 + 7 + 7 = 17.)
import java.util.Scanner;
public class A2 {
    public static void main(String[] args) {
        int sum_even=0, sum_odd=0 , sum_odd_digits=0;
        for (int i=2;i<=100;i++)
        {
            if(i%2==0)
            sum_even++;
        }
        System.out.println("sum of even numbers = "+sum_even);
        System.out.println("please enter two integer borders : ");
        Scanner in=new Scanner(System.in);
        int num1=in.nextInt();
        int num2=in.nextInt();
        for (int i=num1;i<=num2;i++)
        {
            if(i%2!=0)
            sum_odd++;
        }
        System.out.println("sum of odd numbers = "+sum_odd);
        System.out.println("please enter a number : ");
        int num=in.nextInt();
        while(num>0)
        {
            int digit=num%10;
            if(digit%2!=0)
            {
                sum_odd_digits=sum_odd_digits+digit;
            }
            num=num/10;
        }
        System.out.println(sum_odd_digits);
    }


}
