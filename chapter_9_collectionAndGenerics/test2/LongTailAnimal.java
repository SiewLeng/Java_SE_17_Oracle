package test2;

import java.util.List;

public class LongTailAnimal {
   // During compilation:
   // The compiler checks your code for type safety.
   // It then erases all generic type parameters, replacing them with their bounds (or Object if the type is unbounded).
   // The generic type information is completely removed from the bytecode

   protected void chew(List<Object> input) {}

   // protected void chew(List<Double> input) {}  // DOES NOT COMPILE

}