public class Days {
    public static void main(String args[]){
        int n = 400;
        int year = n%365;
        int days = year  % 7;
        int y = n /365;
        System.out.println("Number of years : " + y);
        int z = year / 7;
        System.out.println("Number of weeks : " + z);
        System.out.println("Number of Remaining days : " + days);
    }
    
}
