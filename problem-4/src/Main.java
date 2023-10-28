import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rounds: ");
        int t = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < t; i++) {
            System.out.println("Enter the X coordinate: ");
            int x = scanner.nextInt();

            System.out.println("Enter the Y coordinate: ");
            int y = scanner.nextInt();

            // Find the maximum coordinate (X or Y)
            int maxCoordinate = Math.max(x, y);

            int points = 6 - maxCoordinate;

            sum += points;
        }

        System.out.println("Total Points: " + sum);

        scanner.close();
    }
}
