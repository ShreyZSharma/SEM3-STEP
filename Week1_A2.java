import java.util.Scanner;
public class Week1_A2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter original passage:");
        String original = sc.nextLine();
        System.out.println("Enter typed text:");
        String typed = sc.nextLine();
        checkTypingAccuracy(original, typed);
        sc.close();
    }
    static void checkTypingAccuracy(String original, String typed) {
        int matched = 0;
        int firstMismatch = -1;
        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) == typed.charAt(i)) {
                matched++;
            } else if (firstMismatch == -1) {
                firstMismatch = i;
            }
        }
        double accuracy = (matched * 100.0) / original.length();
        String accuracyText = String.format("%.2f", accuracy);
        if (firstMismatch == -1) {
            System.out.println("Matched: " + matched + "/" + original.length() + " | Accuracy: " + accuracyText + "% | No Mismatches");
        } else {
            System.out.println("Matched: " + matched + "/" + original.length() + " | Accuracy: " + accuracyText + "% | First Mismatch at position " + (firstMismatch + 1) + " ('" + original.charAt(firstMismatch) + "' vs '" + typed.charAt(firstMismatch) + "')");
        }
    }
}

