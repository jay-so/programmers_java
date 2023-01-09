package Step1;


import java.util.HashSet;
import java.util.Set;

public class Problem2 {
    public static int solution(int n) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        if (n == 1) {
            return 1;
        }
        for (int i = 1; i < n; i++) {
            if (set.contains(i) == true) {
                break;
            }
            if (n % i == 0) {
                set.add(i);
                set.add(n / i);
            }
        }
        return answer;
    }
}

