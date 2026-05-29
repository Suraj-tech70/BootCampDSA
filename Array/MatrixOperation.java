import java.util.Scanner;

public class MatrixOperation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int row, col;

        System.out.print("Enter rows: ");
        row = sc.nextInt();

        System.out.print("Enter columns: ");
        col = sc.nextInt();

        int matrix[][] = new int[10][10];

        System.out.println("Enter matrix elements:");

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("\n1. Insert Row");
        System.out.println("2. Insert Column");
        System.out.println("3. Delete Row");
        System.out.println("4. Delete Column");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        int pos;

        switch(choice) {

            // Insert Row
            case 1:

                System.out.print("Enter row position: ");
                pos = sc.nextInt();

                // Shift rows down
                for(int i = row; i > pos - 1; i--) {
                    for(int j = 0; j < col; j++) {
                        matrix[i][j] = matrix[i - 1][j];
                    }
                }

                System.out.println("Enter new row elements:");

                for(int j = 0; j < col; j++) {
                    matrix[pos - 1][j] = sc.nextInt();
                }

                row++;
                break;

            // Insert Column
            case 2:

                System.out.print("Enter column position: ");
                pos = sc.nextInt();

                // Shift columns right
                for(int i = 0; i < row; i++) {
                    for(int j = col; j > pos - 1; j--) {
                        matrix[i][j] = matrix[i][j - 1];
                    }
                }

                System.out.println("Enter new column elements:");

                for(int i = 0; i < row; i++) {
                    matrix[i][pos - 1] = sc.nextInt();
                }

                col++;
                break;

            // Delete Row
            case 3:

                System.out.print("Enter row position to delete: ");
                pos = sc.nextInt();

                for(int i = pos - 1; i < row - 1; i++) {
                    for(int j = 0; j < col; j++) {
                        matrix[i][j] = matrix[i + 1][j];
                    }
                }

                row--;
                break;

            // Delete Column
            case 4:

                System.out.print("Enter column position to delete: ");
                pos = sc.nextInt();

                for(int i = 0; i < row; i++) {
                    for(int j = pos - 1; j < col - 1; j++) {
                        matrix[i][j] = matrix[i][j + 1];
                    }
                }

                col--;
                break;

            default:
                System.out.println("Invalid Choice");
        }

        // Print matrix
        System.out.println("\nUpdated Matrix:");

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}