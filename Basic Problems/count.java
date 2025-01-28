public class count {
    public static void main(String args[]){
        int num = 123459;
        int count =0;
        while (num > 0){
            count=count+1;
            num=num/10;
        }
        System.out.print(count);

    }
    
}
