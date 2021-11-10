import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the binary number ");
        int num = sc.nextInt();
        System.out.println("Decimal number is :"+toDecimal(num));
    }
    public static int toDecimal(int x)
    {
        int decimal = 0;
        int n=0;
        while (true)
        {
            if(x==0)
            {
                break;
            }
            else
            {
                int temp = x%10;
                decimal = (int) (decimal+ temp*Math.pow(2,n));
                x=x/10;
                n++;
            }
        }
        return decimal;
    }
}
