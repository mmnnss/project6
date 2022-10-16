import java.util.Scanner;
// check whether a sequence of inputs, such as 1 7 2 9 9 4 9, contains adjacent duplicates
public class Mmmm {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int ld=0,bd=0;
        while (n>0)
        {
            ld=n%10;
            bd=(n%100)/10;
            if(n==1)break;
            if(bd+1==ld)
               System.out.println("There is a sequence "+bd+" and "+ld);
            else if(bd==ld)
                System.out.println("There is an adjacent duplicates "+bd+" and "+ld);
            n=n/10;

        }

    }
}
