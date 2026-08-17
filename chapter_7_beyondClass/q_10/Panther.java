package q_10;

import java.util.ArrayList;
import java.util.List;

interface Walk { private static List move() { return null; } }

interface Run extends Walk { public ArrayList<Integer> move(); }

class Leopard implements Walk {
    public Integer move() {  
        return null;
    }
}

class Panther implements Run {
    @Override
    public ArrayList<Integer> move() {
      return null;
    }
}