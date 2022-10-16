//Write a program that reads a number and prints all of its binary digits: Print the remainder number % 2, then replace the number with number / 2. Keep going until the number is 0. For example, if the user provides the input 13, the output should be
//1
//0
//1
// 1
import java.util.Scanner;
public class A7 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        for(int i=num;num>0;i--)
        {
            int mod=num%2;
            num=num/2;
            System.out.println(mod);
        }
    }
}
