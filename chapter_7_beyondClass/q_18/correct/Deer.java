package q_18.correct;

public class Deer {
   enum Food {APPLES, BERRIES, GRASS}
   protected class Diet {
      private Food getFavorite() {
         return Food.BERRIES;
      }
  }
   public static void main(String[] seasons) {
    Food f = new Deer().new Diet().getFavorite();
      System.out.print(switch(f) {
         case APPLES -> "a";
         case BERRIES -> "b";
         default -> "c";
      });
    }
}