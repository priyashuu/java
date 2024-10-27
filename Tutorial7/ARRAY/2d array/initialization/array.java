import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int rows =sc.nextInt();
        System.out.print("Enter the number of column : ");
        int columns=sc.nextInt();
        int arr [] [] =new int[rows][columns];
        arr[0][0]=0;
        arr[0][1]=0;
         // rows 
         for (int i =0 ;i<rows;i++){
            System.out.println("enter the " + i + " rows ");
            // columns
            for (int j=0;j<columns;j++){
                arr [i][j]=sc.nextInt();
            }

         }
         // output 
         System.out.println("The given matrix will be ");
         for (int i =0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.err.print(arr[i][j]+ " ");
            }
            System.err.println();
         }
    
    }
}
