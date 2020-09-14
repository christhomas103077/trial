import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,prime=1;
        System.out.println("enter the number to be checked: ");
        n=s.nextInt();
        for (int i = 2; i < n; i++) {
            if (n%i==0) {
                prime=0;
                break;
            }
        }
        if (prime==0) 
            System.out.println("it is a not prime number");
        else
            System.out.println("it is a prime number");
            s.close();
    
    }
}
