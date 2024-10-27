import java.util.Scanner;

public class array {
    
    public static void main(String[] args) {
        int arr1[][]={{1,2,3},{23,12,1},{0,1,2}};
        int arr2[][]={{1,2,3},{23,12,1},{0,1,2}};
        int add[][]=new int[arr1.length][arr2.length];
        for(int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                add[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(add[i][j]+" ");
            }
            System.out.println();
        }

    }
}
