import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program to check if the given number is fibonacci number or not!");
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("Is given number fibonacci? "+checkFibo(num));
    }
    static boolean checkFibo(int x)
    {
        return isPerfectSuare(5*x*x+4) || isPerfectSuare(5*x*x-4);
    }
    static boolean isPerfectSuare(int y)
    {
        int n = (int) Math.sqrt(y);
        return (n*n==y);
    }
}
