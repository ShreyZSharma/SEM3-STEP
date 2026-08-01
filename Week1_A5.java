import java.util.Scanner;
public class Week1_A5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter movie review:");
        String review = sc.nextLine();
        classifyWordLengths(review);
        sc.close();
    }
    static void classifyWordLengths(String review) {
        String[] words = review.split(" ");
        int shortCount = 0;
        int mediumCount = 0;
        int longCount = 0;
        for (int i = 0; i < words.length; i++) {
            int len = words[i].length();
            if (len >= 1 && len <= 4) {
                shortCount++;
            } else if (len >= 5 && len <= 8) {
                mediumCount++;
            } else {
                longCount++;
            }
        }
        System.out.println("Short: " + shortCount + " | Medium: " + mediumCount + " | Long: " + longCount);
    }
}

