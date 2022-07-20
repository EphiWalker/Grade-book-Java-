import java.util.Scanner;
public class Summation {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Please enter a and b");
        int a = x.nextInt();
        int b = x.nextInt();

        int sum = a + b;

        System.out.println("The sum of the two numbers is: " + sum);

    }
}