package Step0;

public class Problem8 {

    public int[] solution(int[] numbers) {

        for(int i = 0;i<numbers.length;i++){
            numbers[i] *= 2;
        }
        return numbers;
    }
}
