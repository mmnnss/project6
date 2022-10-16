//Prime numbers. Write a program that prompts the user for an integer and then prints out all prime numbers up to
// that integer. For example, when the user enters 20, the program should print 2  3 5 7  11 13 17 19
//Recall that a number is a prime number if it is not divisible by any number except 1 and itself. Use a class
//PrimeGenerator with methods nextPrime and isPrime. Supply a class PrimePrinter whose main method reads a user
//input, constructs a PrimeGenerator object, and prints the primes.
public class PrimeGenerator {
    private int num;
    public void isPrime(int n)
    {
        int x=0;
        for(int i=0;i<=n;i++)
        {
            if(n%i==0)x++;
            if(x==2) System.out.println("prime");
            else System.out.println("not prime");

        }
    }

}
