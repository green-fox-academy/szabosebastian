package exercise_before_inheritance;

public class Mentor extends Person {
  public String name ="Dávid";
  public int age = 40;
  public String gender = "male";
  public String level = "senior";


  public void getGoal() {
    System.out.println("My goal is: Educate brilliant junior software developers.");
  }

  public void introduce() {
    System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " "  + level + " mentor.");
  }

  public Mentor(String name, int age, String gender, String level) {

  }

  public Mentor() {
    this.name = "Jane Doe";
    this.age = 30;
    this.gender = "female";
    this.level = "intermediate";
  }
}
