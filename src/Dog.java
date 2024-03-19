public class Dog extends Animals {

  private final String name;
  private final int maxRunDistance;
  private final int maxSwimDistance;

  public Dog(String name, int maxRunDistance, int maxSwimDistance) {
    this.name = name;
    this.maxRunDistance = maxRunDistance;
    this.maxSwimDistance = maxSwimDistance;
  }

  @Override
  public void run(int distance) {
    run(distance, maxRunDistance, "dog", name);
  }

  @Override
  public void swim(int distance) {
    swim(distance, maxSwimDistance, "dog", name);
  }

}
