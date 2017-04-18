package OddAvg;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

/**
 * Created by Bálint on 2017. 04. 18..
 */
public class OddAvgTest {

  @Test
  public void TestWithEvenAndOddNumbers() {
    ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 7));
    OddAvg oddAvg = new OddAvg();
    assertEquals(4, oddAvg.oddAverage(numbers));
  }

  @Test
  public void TestWithOnlyOneNumber() {
    ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1));
    OddAvg oddAvg = new OddAvg();
    assertEquals(1, oddAvg.oddAverage(numbers));
  }

  @Test
  public void TestWithEmptyList() {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    OddAvg oddAvg = new OddAvg();
    assertEquals(0, oddAvg.oddAverage(numbers));
  }
}