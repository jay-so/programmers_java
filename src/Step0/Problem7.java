package Step0;

import java.util.Scanner;
import java.util.Arrays;
class Solution3{
    public static int[] solution(int numer1,int denom1, int numer2,int denom2) {
        int[] answer = new int[2];

        int n = denom1 * denom2;
        int de = numer2 * denom1 + numer1 * denom2;
        int max = 1;

        for (int i = 1; i <= n && i <= de; i++) {
            if (n % i == 0 && de % i == 0) {
                max = i;
            }
        }

        answer[0] = de / max;
        answer[1] = n / max;

        return answer;
    }
}


public class Problem7 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int[] result = Solution3.solution(a,b,c,d);
        System.out.println(result);
    }
}
