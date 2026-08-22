package q_20.correct;

import java.util.List;

interface Yawn {
   String yawn(double d, List<Integer> time);
}

public class Vet {
   public static String takeNap(Yawn y) {
      return y.yawn(10, null);
   }
   public static void main(String... unused) {
        // Yawn y = (z,f) -> { String x = ""; return "Sleep: " + x };
        // Yawn y = (t,s) -> { String t = ""; return "Sleep: " + t; };
        // Yawn y = (w,q) -> {"Sleep: " + w};
        // Yawn y = (e,u) -> { String g = ""; "Sleep: " + e };
        Yawn y = (a,b) -> "Sleep: " + (double)(b==null ? a : a);
        // Yawn y = (r,k) -> { String g = ""; return "Sleep:"; };
        System.out.print(takeNap(y));
   } 

}