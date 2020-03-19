package sum;

import static org.junit.Assert.*;

import java.util.ArrayList;
import org.junit.Test;

public class SumTest {

  Sum checkSum = new Sum();

  @Test
  public void sumMethod() {
    ArrayList<Integer> testInteger = new ArrayList<Integer>();

    testInteger.add(2);
    testInteger.add(199);
    testInteger.add(5);

    assertEquals(206, checkSum.sumMethod(testInteger));
  }

  @Test
  public void emptyArray() {
    ArrayList<Integer> emptyArray = new ArrayList<Integer>();
    assertEquals(0, checkSum.sumMethod(emptyArray));
  }

  @Test
  public void oneElementArray() {
    ArrayList<Integer> oneElementArray = new ArrayList<Integer>();
    oneElementArray.add(7);
    assertEquals(7, checkSum.sumMethod(oneElementArray));
  }

  @Test
  public void nullArray() {
    ArrayList<Integer> nullArray = null;
    assertEquals(0, checkSum.sumMethod(nullArray));
  }
}