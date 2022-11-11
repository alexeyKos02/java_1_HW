import java.util.stream.Stream;

public class Main3 {
    public static void main(String[] args){
        factorial(10);
    }
    static void factorial(int num){
        Stream.iterate(new long[]{1,2},n -> new long[]{n[0]*n[1],n[1]+1}).limit(num).skip(num-1).forEach(x->System.out.println(x[0]));
    }
}
