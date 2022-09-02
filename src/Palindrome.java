import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        int b=a;
        int rem=0;
        int rev=0;
        while (a!=0){
            rem=a%10;
            rev=rev*10+rem;
            a=a/10;
        }
        if (b==rev){
            System.out.println("Entered number is a palindrome number.");
        } else System.out.println("Entered number is not a palindrome number.");
    }
}
