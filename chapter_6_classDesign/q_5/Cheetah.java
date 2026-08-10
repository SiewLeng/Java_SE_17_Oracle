package q_5;

class Speedster {
   int numSpots;
}
public class Cheetah extends Speedster {
   int numSpots;

   public Cheetah(int numSpots) {
      // INSERT CODE HERE
      super.numSpots = numSpots;
      this.numSpots = numSpots;
   }

   public static void main(String[] args) {
      Speedster s = new Cheetah(50);
      System.out.print(s.numSpots);

      Cheetah c = new Cheetah(50);
      System.out.print("\n" + c.numSpots);

   }

}