import java.util.Scanner;
public class Week1_D3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter customer ID:");
        String customerId = sc.nextLine();
        String result = validateCustomerId(customerId);
        System.out.println(result);
        sc.close();
    }
    static String validateCustomerId(String customerId) {
        if (customerId.startsWith("VIP-")) {
            return "VIP Customer";
        } else {
            return "Regular Customer";
        }
    }
}

