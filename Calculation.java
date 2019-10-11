import java.util.Scanner;

public class Calculation {

    public static void result (String input, int a, int b) {
        if (input.equals("add")) {
            System.out.println(a + b);
        } else if (input.equals("subtract")) {
            System.out.println(a - b);
        } else if (input.equals("multiply")) {
            System.out.println(a * b);
        } else if (input.equals("divide")) {
            System.out.println(a / b);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        result(input, a, b);
    }
}
