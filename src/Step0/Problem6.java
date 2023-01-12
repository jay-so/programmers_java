package Step0;

import java.util.Scanner;

class Solution2{
    public static int solution(int num1,int num2){
        if(num1 == num2)
            return 1;
        else
            return -1;
    }
}

public class Problem6 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int result = Solution2.solution(num1,num2);
        System.out.println(result);
    }
}
