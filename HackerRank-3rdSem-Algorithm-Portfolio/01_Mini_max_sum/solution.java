import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    public static void miniMaxSum(List<Integer> arr) {
        long total = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : arr) {
            total += num;

            if (num < min)
                min = num;

            if (num > max)
                max = num;
        }

        long minSum = total - max;
        long maxSum = total - min;

        System.out.println(minSum + " " + maxSum);
    }
}

public class solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader =
            new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(
            bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")
        )
        .map(Integer::parseInt)
        .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}