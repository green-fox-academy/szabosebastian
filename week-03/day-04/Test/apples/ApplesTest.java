package apples;

import static org.junit.Assert.*;

import org.junit.Test;

public class ApplesTest {

  @Test
  public void getApple() {
    Apples apple = new Apples();
    assertEquals("Apple",apple.getApple());
  }

}