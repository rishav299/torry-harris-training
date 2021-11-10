import java.util.Scanner;

public class SumOfPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N: ");
        int n = sc.nextInt();
        System.out.println("Enter the value of M: ");
        int m = sc.nextInt();
        primePrint(n,m);
    }
    static void primePrint(int n, int m)
    {
        int sum=0;
        for(int i = n;i<=m;i++)
        {
            int count=0;

            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    count++;
                }
            }
            if(count==2)
            {
                System.out.println("Prime number "+i);
                sum=sum+i;
            }

        }
        System.out.println(sum);

    }
}
