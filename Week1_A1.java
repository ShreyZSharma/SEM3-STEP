import java.util.Scanner;
public class Week1_A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of seats:");
        int n = Integer.parseInt(sc.nextLine());
        int[] seatNumbers = new int[n];
        System.out.println("Enter seat numbers separated by space:");
        String[] parts = sc.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            seatNumbers[i] = Integer.parseInt(parts[i]);
        }
        checkDuplicateSeats(seatNumbers);
        sc.close();
    }
    static void checkDuplicateSeats(int[] seatNumbers) {
        boolean found = false;
        for (int i = 0; i < seatNumbers.length; i++) {
            for (int j = i + 1; j < seatNumbers.length; j++) {
                if (seatNumbers[i] == seatNumbers[j]) {
                    System.out.println("Duplicate Seat Number Found: " + seatNumbers[i]);
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("No Duplicate Seats Found");
        }
    }
}

