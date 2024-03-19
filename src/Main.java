import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    Dog labrador = new Dog("James", 500, 10);
    Dog shepherd = new Dog("Sharik", 0, 7);
    Dog pekingese = new Dog("Bobik", 450, 15);
    Cat maineCoon = new Cat("Barsik", 350, 0);
    Cat sphinx = new Cat("Nushka", 270, 0);
    List<Animals> animals = new ArrayList<>(List.of(labrador, shepherd, pekingese, maineCoon, sphinx));

    labrador.run(1000);
    shepherd.run(250);
    pekingese.run(200);
    pekingese.swim(10);
    pekingese.swim(20);
    maineCoon.run(150);
    maineCoon.swim(5);

    System.out.println("==================================");

    System.out.println("Total animals: " + (long) animals.size());
    long totalDogs = animals.stream().filter(animal -> animal instanceof Dog).count();
    System.out.println("Total dogs in list: " + totalDogs);

    long totalCats = animals.stream().filter(animal -> animal instanceof Cat).count();
    System.out.println("Total cats in list: " + totalCats);
  }
}