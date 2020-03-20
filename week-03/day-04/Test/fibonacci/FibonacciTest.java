package fibonacci;

import static org.junit.Assert.*;

import org.junit.Test;

public class FibonacciTest {

  Fibonacci testFibonacci = new Fibonacci();

  @Test
  public void main() {
    int n = 10;
    assertEquals(55, testFibonacci.fib(n));
  }

  @Test
  public void zeroTest() {
    int n = 0;
    assertEquals(0, testFibonacci.fib(n));
  }
}