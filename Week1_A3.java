import java.util.Scanner;
public class Week1_A3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter signal log:");
        String signalLog = sc.nextLine();
        findLongestStreak(signalLog);
        sc.close();
    }
    static void findLongestStreak(String signalLog) {
        char longestChar = signalLog.charAt(0);
        int longestCount = 1;
        char currentChar = signalLog.charAt(0);
        int currentCount = 1;
        for (int i = 1; i < signalLog.length(); i++) {
            if (signalLog.charAt(i) == currentChar) {
                currentCount++;
            } else {
                currentChar = signalLog.charAt(i);
                currentCount = 1;
            }
            if (currentCount > longestCount) {
                longestCount = currentCount;
                longestChar = currentChar;
            }
        }
        System.out.println("Longest Streak: '" + longestChar + "' repeated " + longestCount + " times");
    }
}

