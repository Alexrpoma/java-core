package lambdas.custom_foreach;

import java.util.*;

public class App {
  public static void main(String[] args) {
    tmp();
  }
  public static void tmp() {
    CustomForEach<Integer> customForEach = new CustomForEach<>();
    List<Integer> list = new ArrayList<>(List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
    Set<Integer> set = new HashSet<>(List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));

    customForEach.forEach(list, e -> System.out.print(e));
    System.out.println();
    customForEach.forEach(set, e -> System.out.print(e));
  }
}
