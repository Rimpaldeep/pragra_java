import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number");
        int a = sc.nextInt();
        if (a>0) {
            System.out.println("The number entered is positive");
        } else if (a<0) {
            System.out.println("The number entered is negative");
        } else {
            System.out.println("The number entered is 0");
        }
    }
}
