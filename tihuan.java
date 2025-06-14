public class tihuan {
    public static void main(String[] args) {
        String original = "I have an apple, the apple is red.";
        String replaced = original.replaceAll("apple", "fruit");

        System.out.println("替换前: " + original);
        System.out.println("替换后: " + replaced);
    }
}