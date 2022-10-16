// Write a program that reads a word and prints the word in reverse. For example, if the user provides the input
// "Harry", the program prints yrraH
import java.util.Scanner;
public class A4 {
    public static void main(String[] args) {
        System.out.print("enter a word : ");
        Scanner in=new Scanner(System.in);
        String text=in.next();
        for(int n=1;n<=text.length();n++)
        {
            System.out.print(text.charAt(text.length()-n));
        }
    }
}
