public class Amstrong {
    public static void main(String args[]){
        int anum = 156;
        int num = anum;
        int cube;
        int sum = 0, rev;
        while (num > 0){
            rev = num%10;
            cube=rev*rev*rev;
            sum=sum+cube;
            num = num/10;
        }
        if (anum==sum){
            System.out.print("Anstrong number");
        }
        else {
            System.out.print("Not Amstrong number");
        }


    }
    
}
