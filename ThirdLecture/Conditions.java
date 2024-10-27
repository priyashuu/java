import java.util.*;


// public class Conditions {
//     public static void main (String args []){
//        Scanner sc = new Scanner(System.in);
//        int age =sc.nextInt();
//        if (age<18){
//         System.out.println("you are child");

//        }
//        else{
//         System.out.println("you are adult");
//        }
//     }
    
// }
// public class Conditions {
//     public static void main (String args []){
//        Scanner sc = new Scanner(System.in);
//        int age =sc.nextInt();
//        if (age%2==0){
//         System.out.println("Even number");

//        }
//        else{
//         System.out.println("Odd number");
//        }
//     }
    
// }
public class Conditions{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b = sc.nextInt();
        if (a>b){
            System.out.println("a is greater than b ");
        
        }else if(a<b){
            System.out.println("b is greater than a");


        }
        else{
            System.out.println("both are equal");
        }

    }
}
