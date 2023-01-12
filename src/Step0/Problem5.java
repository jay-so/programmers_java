package Step0;

import java.util.Scanner;

class Solution{
    public static int solution(int num1,int num2){
        double answer = (double) num1/num2 *1000;
        return (int)answer;
    }
}

public class Problem5 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int result = Solution.solution(num1,num2);
        System.out.println(result);
    }
}
