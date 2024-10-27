import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // First matrix input
        System.out.print("Enter the number of rows in the first array: ");
        int r1 = sc.nextInt();
        System.out.print("Enter the number of columns in the first array: ");
        int c1 = sc.nextInt();
        int arr1[][] = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            System.out.println("Enter elements for row " + (i + 1) + ": ");
            for (int j = 0; j < c1; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        // Second matrix input
        System.out.print("Enter the number of rows in the second array: ");
        int r2 = sc.nextInt();
        System.out.print("Enter the number of columns in the second array: ");
        int c2 = sc.nextInt();
        int arr2[][] = new int[r2][c2];
        for (int i = 0; i < r2; i++) {
            System.out.println("Enter elements for row " + (i + 1) + ": ");
            for (int j = 0; j < c2; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        // Check if matrix multiplication is possible
        if (c1 != r2) {
            System.out.println("Invalid input: Number of columns in the first array must match the number of rows in the second array.");
            return;
        }

        // Matrix multiplication
        int multiply[][] = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    multiply[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        // Display result
        System.out.println("The resulting matrix after multiplication is: ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(multiply[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
