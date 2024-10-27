import java.util.*;

public class Tutorial1 {
    public static void main(String[] args) {
       int ans= sum3(1,4);
       System.out.println(ans);
    }
    static int  sum2(){
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the num1: ");
        int num1=sc.nextInt();
        System.out.print("enter the num2: ");
        int num2=sc.nextInt();
        int sum = num1+ num2;
        return sum;
       
    }

    static void sum(){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the num1");
        int num1=sc.nextInt();
        System.out.println("enter the num21");
        int num2=sc.nextInt();
        int sum = num1+ num2;
        System.out.println(sum);

    }
    static int sum3(int i ,int j){
       
        int sum =i+j;
        return sum;

    }
}

