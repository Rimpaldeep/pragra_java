public class GreaterThan {
    public static void main(String[] args) {
        int a = 12;
        int b = 17;
        int c = 10;
        if (a>b && a>c) {
            System.out.println("The maximum number is:");
            System.out.println("a = " + a);
        } else if (b>a && b>c) {
            System.out.println("The maximum number is:");
            System.out.println("b = " + b);
        } else {
            System.out.println("The maximum number is:");
            System.out.println("c = " + c);
            System.out.println(" ");
        }
    }
}
