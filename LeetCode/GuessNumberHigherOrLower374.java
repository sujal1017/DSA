import java.util.Scanner;

public class GuessNumberHigherOrLower374 {

    // Secret number (simulating LeetCode's hidden number)
    static int pick;

    // Simulates the guess() API
    public static int guess(int num) {
        if (num == pick) {
            return 0;
        } else if (num > pick) {
            return -1;
        } else {
            return 1;
        }
    }

    // Binary Search
    public static int guessNumber(int n) {
        int left = 1;
        int right = n;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            int result = guess(mid);

            if (result == 0) {
                return mid;
            } else if (result == -1) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the maximum number (n): ");
        int n = sc.nextInt();

        System.out.print("Enter the secret number (pick): ");
        pick = sc.nextInt();

        int answer = guessNumber(n);

        System.out.println("The guessed number is: " + answer);

        sc.close();
    }
}