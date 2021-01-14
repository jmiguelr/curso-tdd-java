
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {


    @Test
  public void fix_me_and_rename_me() {

    // Given
/*
    List<Integer> list = new ArrayList<>();
    for (int i = 1; i < 101; i++) {
      list.add(i);
    }
*/
    // When
    List<String> result =  FizzBuzzClass.doTheCode(); //

    // Then
    for (int i = 0; i < 100; i++) {
      if (i % 3 ==0) {
        result.get(i).contains("Fizz");
      }
      if (i % 5 == 0) {
        result.get(i).contains("Buzz");
      }

      if (i % 3 != 0 && i % 5 != 0) {
        result.get(i).contains(Integer.toString(i));
      }

    }


  }
}
