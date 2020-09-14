import java.util.Scanner;
public class reversestring
{
    public static void main(String[] args)
    {
        char temp;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string");
        String str = scanner.nextLine();

        int n=str.length();
        StringBuilder reverse = new StringBuilder(str);
        for (int i=0;i<n/2;i++)
        {
            temp=reverse.charAt(i);
            reverse.setCharAt(i, reverse.charAt(n-i-1));
            reverse.setCharAt(n-i-1, temp);
        }

        System.out.println("The reverse string is: "+reverse);
    }
}
