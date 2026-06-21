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

        Operation operation = null;
        switch (op) {
            case "+":
                operation = new AddOperation();
                break;
            case "-":
                operation = new SubOperation();
                break;
            case "*":
                operation = new MulOperation();
                break;
            case "/":
                operation = new DivOperation();
                break;
            default:
                System.out.println("不支持的运算符");
                return;
        }

        try {
            double result = operation.compute(a, b);
            System.out.println(a + " " + op + " " + b + " = " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("错误: " + e.getMessage());
        }
    }
}
