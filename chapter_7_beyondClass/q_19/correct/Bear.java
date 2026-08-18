package q_19.correct;

public class Bear {
   enum FOOD {
    BERRIES {
         public boolean isHealthy() { return false; }
    }, 
    INSECTS {
        public boolean isHealthy() { return true; }
    },
    FISH {
        public boolean isHealthy() { return false; }
    }, 
    ROOTS {
        public boolean isHealthy() { return true; }
    }, 
    COOKIES {
        public boolean isHealthy() { return false; }
    }, 
    HONEY {
        public boolean isHealthy() { return true; }
    };
    public abstract boolean isHealthy();
   }

   public static void main(String[] args) {
      System.out.print(FOOD.INSECTS);
      System.out.print(FOOD.INSECTS.ordinal());
      System.out.print(FOOD.INSECTS.isHealthy());
      System.out.print(FOOD.COOKIES.isHealthy());
   }
}
