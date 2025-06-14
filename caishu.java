import java.util.Scanner;
import java.util.Random;

public class caishu{
    public static void main(String[] args) {
        // 初始化随机数生成器和输入扫描器
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // 生成1-100的随机数
        int secretNumber = random.nextInt(100) + 1;
        int guessCount = 0;
        boolean hasWon = false;

        // 游戏主循环
        while (!hasWon) {
            System.out.print("请输入你的猜测（1-100）：");

            // 验证输入有效性
            while (!scanner.hasNextInt()) {
                System.out.println("请输入有效的整数！");
                scanner.next(); // 清除无效输入
                System.out.print("请重新输入（1-100）：");
            }

            int guess = scanner.nextInt();
            guessCount++;

            // 判断猜测结果
            if (guess < 1 || guess > 100) {
                System.out.println("注意：请输入1到100之间的数字！");
                guessCount--; // 不计入有效尝试
            } else if (guess < secretNumber) {
                System.out.println("小");
            } else if (guess > secretNumber) {
                System.out.println("大");
            } else {
                hasWon = true;
                System.out.printf("用了 %d 次猜中了数字 %d！\n", guessCount, secretNumber);
            }
        }


        scanner.close();
    }
}