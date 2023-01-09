package Step0;

import java.util.Scanner;

public class Problem3 {
    public static int solution(int num1, int num2) {
        int mul = num1 * num2;
        return mul;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int result = solution(num1,num2);
        System.out.println(result);
    }
}
