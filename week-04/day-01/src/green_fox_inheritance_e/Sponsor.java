package green_fox_inheritance_e;


public class Sponsor extends Person {
  public String company;
  public int hiredStudents;

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
    super(name,age,gender);
    this.company=company;
    this.hiredStudents = 0;
  }

  public Sponsor() {
    super();
    this.company = "Google";
    this.hiredStudents = 0;
  }
}
