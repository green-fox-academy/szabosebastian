package exercise_before_inheritance;

public class Person {
  public String name ="Szebi";
  public int age = 26;
  public String gender = "male";

  public void introduce() {
    System.out.println("Hi, I'm " + name + ", a " + age + " year old. " + gender);
  }

  public void getGoal() {
    System.out.println("My goal is: Live for the moment!");
  }

  public Person ( String name, int age, String gender) {

  }

  public Person() {
    this.name = "Jane Doe";
    this.age = 30;
    this.gender = "female";
  }
}
