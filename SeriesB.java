import java.util.Scanner;

public class SeriesB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N:");
        int n=sc.nextInt();
        int n1=1,n2=5,n3=8,n4;
        System.out.print(n1+" "+n2+" "+n3);
        for(int i=3;i<n;++i)
        {
            n4=n3+n1+n2;
            System.out.print(" "+n4);
            n1=n2;
            n2=n3;
            n3=n4;
        }
    }
}
