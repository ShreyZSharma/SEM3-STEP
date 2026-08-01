import java.util.Scanner;
public class Week1_A4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of items:");
        int n = Integer.parseInt(sc.nextLine());
        int[] sectionA = new int[n];
        int[] sectionB = new int[n];
        System.out.println("Enter Section A quantities separated by space:");
        String[] aParts = sc.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            sectionA[i] = Integer.parseInt(aParts[i]);
        }
        System.out.println("Enter Section B quantities separated by space:");
        String[] bParts = sc.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            sectionB[i] = Integer.parseInt(bParts[i]);
        }
        analyzeInventory(sectionA, sectionB);
        sc.close();
    }
    static void analyzeInventory(int[] sectionA, int[] sectionB) {
        int totalA = 0;
        int totalB = 0;
        for (int i = 0; i < sectionA.length; i++) {
            totalA += sectionA[i];
        }
        for (int i = 0; i < sectionB.length; i++) {
            totalB += sectionB[i];
        }
        String status = (totalA == totalB) ? "Balanced" : "Not Balanced";
        int highest = sectionA[0];
        String highestSection = "Section A";
        int highestIndex = 1;
        for (int i = 0; i < sectionA.length; i++) {
            if (sectionA[i] > highest) {
                highest = sectionA[i];
                highestSection = "Section A";
                highestIndex = i + 1;
            }
        }
        for (int i = 0; i < sectionB.length; i++) {
            if (sectionB[i] > highest) {
                highest = sectionB[i];
                highestSection = "Section B";
                highestIndex = i + 1;
            }
        }
        System.out.println("Section A Total: " + totalA + " | Section B Total: " + totalB + " | Status: " + status + " | Highest Quantity: " + highest + " (" + highestSection + ", Item " + highestIndex + ")");
    }
}

