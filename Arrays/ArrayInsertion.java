import java.util.Scanner;
public class ArrayInsertion 
{
    public static void main (String args[])
    {
        Scanner Scan = new Scanner(System.in);
        int [] arr = new int[5];
        System.out.println("Enter Array Elements :");
        for (int i =0; i<5 ; i++ ){
            arr[i] = Scan.nextInt();
        }

        System.out.println("Array Integers :");

        for (int i =0; i<5 ; i++ ){
            System.out.println("Index"+" "+i+":"+arr[i]);
        }
        


     }
    
}
