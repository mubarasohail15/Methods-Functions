public class Task1 {
 public static int sumDigits(long n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;  // add last digit
            n /= 10;        // remove last digit
        }
        return sum;
    }

    public static void reverse(int number) {
        while (number != 0) {
            System.out.print(number % 10);
            number /= 10;
        }
        System.out.println();
    }
	import java.util.Scanner;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 System.out.println("Enter an integer to find sum of digits: ");
        long n = input.nextLong();
        System.out.println("Sum of digits: " + sumDigits(n));
System.out.println("Enter an integer to reverse: ");
        int num = input.nextInt();
        System.out.print("Reversed number: ");
        reverse(num);
    }
}
