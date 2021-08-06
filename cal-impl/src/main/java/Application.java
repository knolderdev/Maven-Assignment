import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

import java.util.Scanner;

public final class Application {
    private Application() {
    }

    /**
     * @param args
     */
    @SuppressFBWarnings({"DM_DEFAULT_ENCODING", "DLS_DEAD_LOCAL_STORE"})
    public static void main(final String[] args) {

        System.out.println("This is a basic calculator");
        Calculator c = new Calculator();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the two numbers: ");
        int num1 = s.nextInt();
        int num2 = s.nextInt();

        Calculator calci = new Calculator();
        calci.multiplication(num1, num2);
        calci.division(num1, num2);
        calci.addition(num1, num2);
        calci.substraction(num1, num2);

    }
}
