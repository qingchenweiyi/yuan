import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class pingjunshu {
    public static void main(String[] args) {
        double[] data = {1.0, 2.0, 3.0, 4.0, 5.0, 5.0};

        // 均值
        double mean = Arrays.stream(data).average().orElse(0.0);

        // 中位数
        Arrays.sort(data);
        double median = data.length % 2 == 0 ?
                (data[data.length / 2 - 1] + data[data.length / 2]) / 2 :
                data[data.length / 2];

        // 众数
        Map<Double, Integer> frequencyMap = new HashMap<>();
        for (double num : data) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        double mode = frequencyMap.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .get().getKey();

        // 标准差
        double variance = Arrays.stream(data)
                .map(x -> Math.pow(x - mean, 2))
                .average().orElse(0.0);
        double stdDev = Math.sqrt(variance);

        System.out.printf("均值: %.2f\n", mean);
        System.out.printf("中位数: %.2f\n", median);
        System.out.printf("众数: %.2f\n", mode);
        System.out.printf("标准差: %.2f\n", stdDev);
    }
}