public class q_21 {
    
    void findZookeeper(Long id) {
        System.out.print(switch(id) {
            case 10 -> {"Jane"}
            case 20 -> {yield "Lisa";};
            case 30 -> "Kelly";
            case 30 -> "Sarah";
            default -> "Unassigned";
        });
    }
    
    void findZookeeperCorrect(int id) {
        System.out.print(switch(id) {
            case 10 -> {yield "Jane";}
            case 20 -> {yield "Lisa";}
            case 30 -> "Kelly";
            case 40 -> "Sarah";
            default -> "Unassigned";
        });
    }

    public static void main(String[] args) {
       new q_21().findZookeeperCorrect(10);
    }
}