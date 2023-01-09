package Step0;

import java.util.Scanner;

public class Problem1 {
    //soultion함수
    public static int solution(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        //1.정수 num1과 num2값을 입력받음
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        //2. 입력받은 정수값(num1,num2)의 합을 구하는 soluton 함수를 호출
        int result = solution(num1,num2);

        System.out.println(result);

    }
}
