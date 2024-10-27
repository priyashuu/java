import java.util.Arrays; // importing module so we can print the elements  in a correct formating

public class demoArrar {
    public static void main (String [] args){
        int  myArray[] =new int[5];
        myArray[0]=1; // adding the elements
        myArray[1]=1;
        myArray[2]=23;
        myArray[3]=56;
        myArray[4]=78;
        myArray[2]=9;// updating the values
        // myArray[5]=98;it will show an error ==> Index 5 out of bounds for length 5at demoArrar.main
        
        System.out.print(Arrays.toString(myArray)); // it is methods to print the elements 

    }
    
}
