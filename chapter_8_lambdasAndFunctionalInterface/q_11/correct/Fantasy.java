package q_11.correct;

import java.util.function.Predicate;

public class Fantasy {
   public static void scary(String animal) {
      Predicate<String> dino = s -> "dino".equals(s);
      Predicate<String> dragon = s -> "dragon".equals(s);
      var combined = dino.or(dragon);
      System.out.println(combined.test(animal));
   }
   public static void main(String[] args) {
      scary("dino");
      scary("dragon");
      scary("unicorn");
   }
}