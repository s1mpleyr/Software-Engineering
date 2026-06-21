import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入第一个数: ");
        double a = scanner.nextDouble();
        System.out.print("请输入运算符(+ - * /): ");
        String op = scanner.next();
        System.out.print("请输入第二个数: ");
        double b = scanner.nextDouble();
        scanner.close();

        OperationFactory factory = null;
        switch (op) {
            case "+":
                factory = new AddFactory();
                break;
            case "-":
                factory = new SubFactory();
                break;
            case "*":
                factory = new MulFactory();
                break;
            case "/":
                factory = new DivFactory();
                break;
            default:
                System.out.println("不支持的运算符");
                return;
        }

        Operation operation = factory.createOperation();
        try {
            double result = operation.compute(a, b);
            System.out.println(a + " " + op + " " + b + " = " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("错误: " + e.getMessage());
        }
    }
}
