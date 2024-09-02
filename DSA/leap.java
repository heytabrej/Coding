import java.util.Scanner;

public class leap{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt(); // Number of test cases

        for (int i = 0; i < T; i++) {
            int year = scanner.nextInt(); // Input year
            String result = isLeapYear(year) ? "Yes" : "No";
            System.out.println(result);
        }

        scanner.close();
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}


