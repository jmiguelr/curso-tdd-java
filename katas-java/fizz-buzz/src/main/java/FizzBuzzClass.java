import java.util.ArrayList;
import java.util.List;

public class FizzBuzzClass {

  public static List<String> doTheCode() {

    //     IntStream.range(1,101).forEach(System.out::println );

    List<Integer> list = new ArrayList<>();
    for (int i = 1; i < 101; i++) {
      list.add(i);
    }

    List<String> result = new ArrayList<>();
    for (Integer integer : list) {
      String tmpString = "";

      if (integer % 3 == 0) {
        tmpString += "Fizz";
      }
      if (integer % 5 == 0) {
        tmpString += "Buzz";
      }
      if (tmpString.equals("")) {
        var resultInt = integer + 1;
        tmpString = "" + resultInt;
      }

      result.add(tmpString);
    }

    return result;

  }

}
