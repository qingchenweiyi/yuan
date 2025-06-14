import java.util.Scanner;

public class fenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入字符串: ");
        String str = scanner.nextLine();
        System.out.print("输入分隔符（如空格或逗号）: ");
        String delimiter = scanner.nextLine();

        String[] words = str.split(delimiter);
        System.out.println("分割结果:");
        for (String word : words) {
            System.out.println(word);
        }
        scanner.close();
    }
}