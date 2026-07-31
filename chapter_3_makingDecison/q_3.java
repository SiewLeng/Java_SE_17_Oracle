public class q_3 {
    private static void loopOverArray() {
    String[] fruits = {"Apple", "Banana", "Cherry"};

        // For-each loop over an array
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
    
    private static void loopOverMap() {
        Map<String, Double> milkPrices = new HashMap<>();
        milkPrices.put("Marigold Milk", 3.45);
        milkPrices.put("FrsshFarm Milk", 3.00);
        for (var item: milkPrices){
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        loopOverArray();
        // loopOverMap();
    }
}