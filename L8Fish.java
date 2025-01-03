public class L8Fish extends L8Tiger {
  public void swim() {
    System.out.println("I am swimming...");
  }

  public void layEggs() {
    System.out.println("I am Laying Eggs...");
  }

  public static void main(String args[]) {
    L8Fish fry = new L8Fish();
    fry.live();
    fry.swim();
    fry.hunt();
    fry.breed();
    fry.layEggs();
  }
}
/*
 * Output
 * I am Living...
 * I am swimming...
 * I am Hunting...
 * I am Breeding...
 * I am Laying Eggs...
 */