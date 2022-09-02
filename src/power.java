import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();
        System.out.print("Enter the power: ");
        int x = sc.nextInt();
        int multiply = 1;
        for (int i = 1; i <= x; i++) {
            multiply *= a;
        }
        System.out.println("The answer is: "+multiply);
    }
}
