

public class pattern2 {
    public static void main(String[] args) {
        int m=4; // no of rows
        int n=5; // no of columns
        for(int i=1;i<=m;i++){
            for (int j=1;j<=n;j++){
                if (i==1 || j==1 || i==4 || j==5){
                    System.out.print("*"+ " ");
                }
                else{
                    System.out.print("  ");
                }
                

            }
            System.out.println("");
            
            
        }
        
    }
}
