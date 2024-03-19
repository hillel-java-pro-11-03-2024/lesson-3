public abstract class Animals {

  protected void run(int distance, int maxDistance, String animal, String name) {
    if (maxDistance == 0) {
      System.out.println("The " + animal + " " + name + " can't run.");
    }
    else if (distance > maxDistance) {
      System.out.println("The " + animal + " " + name + " can't run so far.");
    }
    else {
      System.out.println("The " + animal + " " + name + " running " + distance + " m.");
    }
  }

  protected void swim(int distance, int maxDistance, String animal, String name) {
    if (maxDistance == 0) {
      System.out.println("The " + animal + " " + name + " can't swim.");
    }
    else if (distance > maxDistance) {
      System.out.println("The " + animal + " " + name + " can't swim so far.");
    }
    else {
      System.out.println("The " + animal + " " + name + " swimming " + distance + " m.");
    }
  }

  void run(int distance) {}

  void swim(int distance) {}


}
