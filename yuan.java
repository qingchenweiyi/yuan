import java.util.Scanner;

public class yuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入圆的半径: ");
        double radius = scanner.nextDouble();
        double circumference = 2 * Math.PI * radius;//周长
        double area = Math.PI * Math.pow(radius, 2);//面积
        double volume = (4.0 / 3) * Math.PI * Math.pow(radius, 3);//体积
        System.out.printf("圆的周长: %.2f\n", circumference);
        System.out.printf("圆的面积: %.2f\n", area);
        System.out.printf("球体的体积: %.2f\n", volume);

        scanner.close();
    }
}
