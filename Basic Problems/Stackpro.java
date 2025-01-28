import java.util.Stack;
public class Stackpro {
    public static void main(String args []){
        String S =  ("ACBBD");
        int n = S.length();
        Stack <Character> A = new Stack<>();
        for (int i = 0; i<n ; i++){
           char m = (S.charAt(i));
           if(!A.isEmpty()){
            if(m=='B'&& A.peek()=='A' || m=='D'&& A.peek()=='C'){
                A.pop();
               }
               else {
                A.push(m);
               }
           }
           else {
            A.push(m);
           }
          
           
        }
        
        System.out.println(A.size());

    }
    
}


        /*Stack <String> Car = new Stack<>();
        Car.push ("Tata Nano");
        Car.push("Honda");
        Car.push("Mahendra");
        System.out.println( Car);
        Car.pop();
        System.out.println( Car.search("Mahendra"));
        System.out.println( Car.isEmpty());
        System.out.println( Car.peek()); */
