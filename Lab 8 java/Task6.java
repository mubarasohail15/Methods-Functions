import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a line of lowercase words: ");
        String line = input.nextLine();

        boolean newWord = true;  // to check start of a word

        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);

            if (ch == ' ') {
                System.out.print(ch);   
                newWord = true;         
            } else {
                if (newWord) {
                    
                    System.out.print(Character.toUpperCase(ch));
                    newWord = false;
                } else {
                   
                    System.out.print(ch);
                }
            }
        }
    }
}
