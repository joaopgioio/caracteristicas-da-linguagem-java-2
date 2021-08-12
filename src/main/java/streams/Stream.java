package streams;

import java.util.stream.IntStream;

public class Stream {
  public static void main(String[] args) {
    IntStream.of(1, 2, 3, 4, 5).forEach(n -> {
      //System.out.println(n);
      IntStream.range(0, 12).forEach(t -> {
        System.out.println(String.valueOf(n +  t));
      });
    });
  }
}
