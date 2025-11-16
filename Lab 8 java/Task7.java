import java.util.Random;

public class Task7{

    public static void printMatrix(int n) {
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(rand.nextInt(2) + " "); // 0 or 1
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter n: ");
        int n = input.nextInt();
        printMatrix(n);
    }
}
