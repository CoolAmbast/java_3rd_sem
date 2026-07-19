public class sum {
    public static void main(String[] args) {
        float a, b;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter first number: ");
        a = sc.nextFloat();
        System.out.print("Enter second number: ");
        b = sc.nextFloat();
        float sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
        sc.close();
    }
}
