package testing3;

class Penguin {
   public int getHeight() { return 3; }

   public void printInfo() {
        System.out.println(this.getHeight());
   }
}

public class EmperorPenguin extends Penguin {
   public int getHeight() { return 8; }

   public static void main(String []fish) {
      new EmperorPenguin().printInfo();
      new Penguin().printInfo();
   }
}