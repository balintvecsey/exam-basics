import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Bálint on 2017. 04. 18..
 */
public class OddAvgTest {

  @org.junit.Test
  public void oddAverage(ArrayList<Integer> numbers) {
    ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 7));
    assertEquals(4, oddAverage(numbers));
  }

}