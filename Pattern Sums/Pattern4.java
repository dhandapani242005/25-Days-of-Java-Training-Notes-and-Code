public class Pattern4 {
    public static void main(String args[]){
        int n=6;
        int k=n-1;
        for(int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if (i==0 || j==0 || i==k || j==k)
                    System.out.print(" * ");
                else {
                    System.out.print("   ");
                }
            }
            System.out.println(" ");
        }
    }
    
}
