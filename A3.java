//Write a program that reads a word and prints each character of the word on a separate line. For example, if the
// user provides the input "Harry", the program prints H A R R Y
import java.util.Scanner;
public class A3 {
    public static void main(String[] args) {
        System.out.print("enter a word : ");
        Scanner in=new Scanner(System.in);
        String text=in.next();
        for(int n=text.length();n>0;n--)
        {
            System.out.println(text.charAt(text.length()-n));
        }
    }
}
