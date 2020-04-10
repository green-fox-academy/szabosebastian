package pirates;

import java.util.Random;

public class Pirate {
  private int rumLevel;
  private int status;// if status  0 = dead, 1 = passed out , 2 = alive
  protected String name;

  //Create a Pirate class. While you can add other fields and methods, you must have these methods:-
  //
  //drinkSomeRum() - intoxicates the Pirate some
  //howsItGoingMate() - when called, the Pirate replies, if drinkSomeRun was called:-
  //0 to 4 times, "Pour me anudder!"
  //else, "Arghh, I'ma Pirate. How d'ya d'ink its goin?", the pirate passes out and sleeps it off.
  //If you manage to get this far, then you can try to do the following.
  //
  //die() - this kills off the pirate, in which case, drinkSomeRum, etc. just result in he's dead.
  //brawl(x) - where pirate fights another pirate (if that other pirate is alive) and there's a 1/3 chance, 1 dies, the other dies or they both pass out.
  //And... if you get that far...
  //
  //Add a parrot.

  public Pirate(String name){
    this.rumLevel = 0;
    this.status = 2;
    this.name = name;
  }

  public void drinkSomeRum(){
    if (this.status == 2){
      rumLevel++;
    }else if (this.status == 1){
      System.out.println("Errrgh dat piRATe iz pass'd out");
    }else{
      System.out.println("Arghh you lil rat itz ded");
    }
  }

  public void howItGoingMate(){
    if (this.status == 2){
      if(this.rumLevel <= 4){
        System.out.println("Pour me anudder!");
      }else {
        System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
      }
    }else if (this.status == 1){
      System.out.println("Errrgh dat piRATe iz pass'd out");
    }else{
      System.out.println("Arghh ya lil rat itz ded");
    }
  }

  public void die(){
    this.status = 0;
  }

  public void brawl(Pirate pirate1){
    Random random = new Random();
    int chance = random.nextInt(3);
    int chance1 = random.nextInt(3);
    if (chance < chance1){
      this.die();
      System.out.println(this.name + " iz ded.");
    }else if (chance == chance1){
      this.status = 1;
      pirate1.setStatus(1);
      System.out.println("Dey nock'd each odah'!");
    }else {
      pirate1.die();
      System.out.println(pirate1.name + " iz ded.");
    }
  }
  public void setStatus(int status) {
    this.status = status;
  }
  public void addParrot(){
    System.out.println("Added a parrot for no reason....");
  }


}