package counter;

public class Counter {
  int value;
  int startValue;

  public Counter() {
    this(0);
  }

  public Counter(int value) {
    this.startValue = value;
    this.value = value;
  }

  public void add(int number) {
    value += number;
  }

  public void add() {
    value++;
  }

  public int get() {
    return value;
  }

  public void reset() {
    value = startValue;
  }
}
