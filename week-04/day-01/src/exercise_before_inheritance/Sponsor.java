package exercise_before_inheritance;

public class Sponsor extends Person {
  public String name ="Jobs";
  public int age = 51;
  public String gender = "male";
  public String company = "Apple.inc";
  public int hiredStudents = 77;

  public void introduce() {
    System.out.println("Hi, I'm " + name + " , a " + age + " year old " + gender + " who represents " + company + " and hired " + hiredStudents + " students so far.");
  }

  public void hire() {
    hiredStudents += 1;
  }

  public void getGoal() {
    System.out.println("My goal is: Hire brilliant junior software developers.");
  }

  public Sponsor (String name, int age, String gender, String company) {
    hiredStudents = 0;
  }

  public Sponsor() {
    this.name = "Jane Doe";
    this.age = 30;
    this.gender = "female";
    this.company = "Google";
    this.hiredStudents = 0;
  }
}
