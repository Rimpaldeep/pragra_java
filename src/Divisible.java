import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Please enter the number:");
        int a = sc.nextInt();
        if (a%5==0 && a%11==0) {
            System.out.println("The number entered is divisible by 5 and 11");
        } else {
            System.out.println("The number entered is not divisible by 5 and 11");
        }
    }
}
