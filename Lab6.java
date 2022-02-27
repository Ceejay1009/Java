import java.util.Scanner;

class ExceptionA extends Exception {
    public ExceptionA(String message) {
        System.out.println(message);
    }
}

class ExceptionB extends Exception {
    public ExceptionB(String message) {
        System.out.println(message);
    }
}

public class Lab6 {
    public static void main(String[] args) {
        //array
        int arr[]={2,4,6,8,10};

        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+"|");
        System.out.print("\n");
        prompt(arr);
    }

    public static void prompt(int arr[]) {
        Scanner scan=new Scanner(System.in);
        //input
        System.out.print("Enter an index of a value in the array: ");
        int index=scan.nextInt();

        try {
            //if index is negative
            if(index<0)
                throw new ExceptionA("\nExceptionA: index cannot be negative");
            else if(index>=arr.length)
                throw new ExceptionB("\nExceptionB: Number cannot be >= array length");
            else
                System.out.println("\nthe value at the index "+index+" is "+arr[index]);
        } catch (ExceptionA obj) {
            prompt(arr);
        } catch (ExceptionB obj) {
            prompt(arr);
        }
    }
}