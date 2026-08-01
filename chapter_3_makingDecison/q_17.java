public class q_17 {
    private void countAttendees() {
        int participants = 4, animals = 2, performers = - 1; 
        while((participants = participants+1) < 10) {}
        do {} while (animals++ <= 1);
        for( ; performers<2; performers+=2) {} 
        System.out.println(participants);
        System.out.println(animals);
        System.out.println(performers);

    }

    public static void main(String[] args) {
        new q_17().countAttendees();
    }
}