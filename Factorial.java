import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number Num: ");
        int n = sc.nextInt();
        long f1 = 1;
        if(n<0)
        {
            System.out.println("Invalid input!!!");
        }
        else
        {
            for(int i = 1;i<=n;i++)
            {
                f1 *=i;
            }
            System.out.println("Factorial of given number is = " + f1);
        }

    }
}
