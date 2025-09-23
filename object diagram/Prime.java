import java.util.Scanner;
public class Prime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Prime"); 
        int n = sc.nextInt();
         int count = 0;
        for ( int i =2 ; i < n ; i++){
            if (n % i !=0){

                { count++; 
                }
                if (count == n-23
            ){
                    System.out.println("Prime Number");
                } else {
                    System.out.println("Not a prime number");
                }
            }
        }sc.close();
    }
}
