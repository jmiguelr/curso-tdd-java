
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {


  @Test
  public void testFizz() {

    // Given
    // When
    List<String> result = FizzBuzzClass.doTheCode(); //
    // Then
    for (int i = 0; i < 100; i++) {
      if (i + 1 % 3 == 0) {
        assertTrue(result.get(i).equals("Fizz"));
      }
    }
  }

  @Test
  public void testBuzz() {

    // Given
    // When
    List<String> result = FizzBuzzClass.doTheCode(); //
    // Then
    for (int i = 0; i < 100; i++) {
      if (i + 1 % 5 == 0) {
        assertTrue(result.get(i).equals("Buzz"));
      }
    }
  }

  @Test
  public void testNumber() {

    // Given
    // When
    List<String> result = FizzBuzzClass.doTheCode(); //

    // Then
    assertTrue( result.get(2).equals("Fizz"));
    assertTrue( result.get(4).equals("Buzz"));
    assertTrue( result.get(14).equals("FizzBuzz"));

/*


    for (int i = 0; i < 100; i++) {
      if (i + 1 % 3 != 0 && i + 1 % 5 != 0) {
        assertTrue(result.get(i).equals(Integer.toString(i)));
      }

    }
*/
  }


  @Test
  public void testSize() {
    // assertFizzBuzzClass.doTheCode()
  }

  // private getElement( List<String> )

}
