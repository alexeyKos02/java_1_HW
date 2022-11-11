import java.util.stream.Stream;

public class Main1 {
    public static void main(String[] args){
        fibonacci(8);
    }
    static void fibonacci(int num){
        Stream.iterate(new int[]{0,1}, arr -> new int[]{arr[1],arr[0]+arr[1]}).limit(num)
                .map(y->y[0])
                .forEach(System.out::println);
    }
}
