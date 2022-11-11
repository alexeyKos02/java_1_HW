import java.util.stream.IntStream;

public class Main4 {
    public static void main(String[] args){
        int[] numbers = {1,7,4,8,2,3,0,65,3};
        for (int i = numbers.length-1; i>=1;i--){
            for (int b = 0; b<i;b++){
                if (numbers[b]>numbers[b+1]){
                    int temp = numbers[b+1];
                    numbers[b+1]=numbers[b];
                    numbers[b]= temp;
                }
            }
        }
        IntStream.of(numbers).forEach(System.out::println);
    }
}
