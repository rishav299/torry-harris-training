import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of X: ");
        int x=sc.nextInt();
        System.out.println("Enter the binary N: ");
        int n=sc.nextInt();
        System.out.println("Power is " +powerOf(x,n));
    }
    public static int powerOf(int x, int n)
    {
        int decimal = 0;
        int p=0;
        while (true)
        {
            if(n==0)
            {
                break;
            }
            else
            {
                int temp = n%10;
                decimal = (int) (decimal+ temp*Math.pow(2,p));
                n=n/10;
                p++;
            }
        }
        int power = 1;
        for(int i=1;i<=decimal;i++)
        {
            power=power*x;
        }
        return power;
    }
}
