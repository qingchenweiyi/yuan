
import java.util.Scanner;

public class tongji {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入字符串: ");
        String str = scanner.nextLine();

        int letters = 0, digits = 0, spaces = 0, specials = 0;
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) letters++;
            else if (Character.isDigit(c)) digits++;
            else if (Character.isWhitespace(c)) spaces++;
            else specials++;
        }

        System.out.println("字母: " + letters);
        System.out.println("数字: " + digits);
        System.out.println("空格: " + spaces);
        System.out.println("特殊字符: " + specials);
        scanner.close();
    }
}