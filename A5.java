//Write a program that reads a word and prints the number of vowels in the word. For this exercise, assume that
// a e i o u y are vowels. For example, if the user provides the input "Harry", the program prints 2 vowels.
import java.util.Scanner;
public class A5 {
    public static void main(String[] args) {
        System.out.print("enter a word : ");
        Scanner in=new Scanner(System.in);
        String text=in.next();
        int sum=0;
        for(int n=0;n<text.length();n++)
        {
           if(text.charAt(n)=='a'||text.charAt(n)=='e'||text.charAt(n)=='i'||text.charAt(n)=='o'||text.charAt(n)=='u'||text.charAt(n)=='y')
           {
               sum++;
           }
        }
        System.out.println(sum);
    }
}
