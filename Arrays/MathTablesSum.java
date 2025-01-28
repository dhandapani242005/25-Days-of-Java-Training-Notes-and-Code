public class MathTablesSum {
    public static void main(String args[]){
        int n = 20;
        int [] arr = new int [n];
        for (int i=1; i<n; i++){
            int m = i*2;
            arr[i] = m;
        }
        for (int i=1; i<n; i++){
           System.out.println(arr[i]);
        }

    }
    
}
