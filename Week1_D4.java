import java.util.Scanner;
public class Week1_D4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word or sentence:");
        String text = sc.nextLine();
        char result = findFirstNonRepeatingChar(text);
        if (result == '\0') {
            System.out.println("No Non-Repeating Character Found");
        } else {
            System.out.println("First Non-Repeating Character: '" + result + "'");
        }
        sc.close();
    }
    static char findFirstNonRepeatingChar(String text) {
        int[] count = new int[256];
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            count[c]++;
        }
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (count[c] == 1) {
                return c;
            }
        }
        return '\0';
    }
}

