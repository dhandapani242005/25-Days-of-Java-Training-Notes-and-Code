public class Fibanosi {
    public static void main(String args[]){
        int num = 7;
        int a = 0 , b = 1 ;
        int c=0;
        System.out.print (a +" "+ b+" ");
        for (int i=a; i<num-2; i++){
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
        }
    }

}
    
