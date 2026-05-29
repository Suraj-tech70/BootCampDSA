import java.util.Scanner;

public class HighestRowSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int row, col;

        System.out.print("Enter rows: ");
        row = sc.nextInt();

        System.out.print("Enter columns: ");
        col = sc.nextInt();

        int matrix[][] = new int[row][col];

        System.out.println("Enter matrix elements:");

        // Input matrix
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int maxSum = 0;
        int rowNumber = 0;

        // Find highest row sum
        for(int i = 0; i < row; i++) {

            int sum = 0;

            for(int j = 0; j < col; j++) {
                sum = sum + matrix[i][j];
            }

            System.out.println("Sum of Row " + (i + 1) + " = " + sum);

            if(sum > maxSum) {
                maxSum = sum;
                rowNumber = i + 1;
            }
        }

        System.out.println("Highest Sum Row = " + rowNumber);
        System.out.println("Highest Sum = " + maxSum);
    }
}
