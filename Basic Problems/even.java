public class even {
    public static void main(String args[]){
        int n = 10;
        System.out.print ("Even : ");
        for (int i=1; i<n+1; i++){
            if (i % 2 ==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.print("Odd : ");
        for (int i=1; i<n+1; i++){
            if (i % 2 ==1){
                System.out.print(i+" ");
            }
        }
    }
            
}
