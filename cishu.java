import java.util.HashMap;
import java.util.Map;

public class cishu {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 3, 5,10,55,55};
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        System.out.println("重复元素及次数:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + "次");
            }
        }
    }
}