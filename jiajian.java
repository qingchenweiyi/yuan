
import java.math.BigInteger;
import java.util.Scanner;

public class jiajian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入第一个大整数: ");
        BigInteger num1 = new BigInteger(scanner.next());
        System.out.print("输入第二个大整数: ");
        BigInteger num2 = new BigInteger(scanner.next());

        BigInteger sum = num1.add(num2);
        BigInteger difference = num1.subtract(num2);

        System.out.println("加法结果: " + sum);
        System.out.println("减法结果: " + difference);
        scanner.close();
    }
}