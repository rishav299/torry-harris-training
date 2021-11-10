import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the decimal number ");
        int num = sc.nextInt();
        toBinary(num);
    }
    public static void toBinary(int x)
    {
        int arrB[] = new int[30];
        int index = 0;
        while(x>0)
        {
            arrB[index++]=x%2;
            x=x/2;
        }
        for(int i=index-1;i>=0;i--)
        {
            System.out.print(arrB[i]);
        }
        System.out.printf("");
    }
}
