public class Reversenum {
    public static void main(String args[]){
        int num = 1203400;
        while (num >0){
            int rev = num%10;
            num = num/10;
            System.out.print(rev);
        }
        
    }
    
}
