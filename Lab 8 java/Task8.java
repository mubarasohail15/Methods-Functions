public class Task8 {

    public static int countVowels(String s) {
        int count = 0;
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ("aeiou".indexOf(ch) != -1)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        System.out.println("Number of vowels in the string: " + countVowels(str));
    }
}
