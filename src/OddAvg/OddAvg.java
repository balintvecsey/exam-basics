package OddAvg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OddAvg {

  public static void main(String[] args) {

  }

  public int oddAverage(ArrayList<Integer> numbers) {
    List<Integer> oddNumbers = new ArrayList<>();
    int sum = 0;
    int avg = 0;
    for (int i = 0; i < numbers.size(); i++) {
      if (numbers.get(i) % 2 != 0) {
        oddNumbers.add(numbers.get(i));
      }
    }

    for (int i = 0; i < oddNumbers.size(); i++) {
      sum += oddNumbers.get(i);
    }

    if (oddNumbers.size() > 0) {
      avg = sum / oddNumbers.size();
    } else {
      return avg;
    }
    return avg;
  }
}
