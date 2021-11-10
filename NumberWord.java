import java.util.Scanner;

public class NumberWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = sc.nextInt();
        if (number == 0) {
            System.out.print("Number in words: Zero");
        } else {
            System.out.print("Number in words: " + numberToWord(number));
        }

    }
    private static String numberToWord(int number) {
        String words = "";
        String unitsArray[] = { "zero", "one", "two", "three", "four", "five", "six",
                "seven", "eight", "nine"};
        int r;
        while(number>0)
        {
            r=number%10;
            // words+=numberToWord(r) + " ";
            words += unitsArray[r]+" ";
            number/=10;
        }
        for (int i=0;i<words.length();i++)
        {
            return words;
        }
        return words;
    }
}
