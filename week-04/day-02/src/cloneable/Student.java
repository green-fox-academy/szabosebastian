package cloneable;

public class Student extends Person implements Cloneable{
  public String previousOrganization;
  public int skippedDay;

  public void getGoal() {
    System.out.println("My goal is: be a junior software developer.");
  }

  public void introduce() {
    System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " from " + previousOrganization + " who skipped " + skippedDay + " days from the course already.");
  }

  public void skipDays(int numberOfDays) {
    skippedDay += numberOfDays;
  }

  public Student(String name, int age, String gender, String previousOrganization) {
    super(name, age, gender);
    this.previousOrganization = previousOrganization;
  }

  public Student() {
    super();
    this.previousOrganization = "The School of Life";
    this.skippedDay = 0;
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }
}
