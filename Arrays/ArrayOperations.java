import java.util.*;
public class ArrayOperations {
    public static void main (String args[]){
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter Array Size : ");
        int n = scan . nextInt();
        int [] arr = new int [n];
        for (int i = 0 ; i < n ; i ++){
             arr[i] = scan.nextInt();
        }
        System.out.print("Reversed array : ");
        for(int i = n-1; i>=0; i--){
           // System.out.print (i);
            System.out.print(arr[i] +" " ) ;
        }
        System.out.println(" ");
        
        Arrays.sort(arr);
        System.out.println("Second Largest : "+arr[n-2]);
        
        Set <Integer>  set = new HashSet<>();
        for (int num : arr){
            set.add(num);
        }

        
        System.out.println("Duiplicates Removed : " + set);
        }




    }
    

