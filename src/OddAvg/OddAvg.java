import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OddAvg {
  public static void main(String[] args) {

    System.out.println(oddAverage(new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 7))));
  }

  public static int oddAverage(ArrayList<Integer> numbers) {
    List<Integer> oddNumbers = new ArrayList<>();
    int sum = 0;
    for (int i = 0; i < numbers.size(); i++) {
      if (numbers.get(i) % 2 != 0) {
        oddNumbers.add(numbers.get(i));
      }
    }

    for (int i = 0; i < oddNumbers.size(); i++) {
      sum += oddNumbers.get(i);
    }

    int avg = sum / oddNumbers.size();
    return avg;
  }
}
