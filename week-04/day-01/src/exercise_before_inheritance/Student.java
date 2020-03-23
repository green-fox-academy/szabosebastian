package exercise_before_inheritance;

public class Student extends Person{
  public String name ="Szebi";
  public int age = 26;
  public String gender = "male";
  public String previousOrganization = "OE";
  public int skippedDay = 10;

  public void getGoal() {
    System.out.println("My goal is: be a junior software developer.");
  }

  public void introduce() {
    System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " from " + previousOrganization + " who skipped " + skippedDay + " days from the course already.");
  }

  public void skipDays (int numberOfDays) {
    skippedDay += numberOfDays;
  }

  public Student (String name, int age, String gender, String previousOrganization) {
    skippedDay = 0;
  }

  public Student() {
    this.name = "Jane Doe";
    this.age = 30;
    this.gender = "female";
    this.previousOrganization = "The School of Life";
    this.skippedDay = 0;
  }
}
