
public class q_10 {
    enum DayOfWeek {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }
    
    private DayOfWeek getWeekDay(int day, final int thursday) {
    int otherDay = day;
    int Sunday = 0;
        switch(otherDay) {
            default:
            case 1: continue; 
            case thursday: return DayOfWeek.THURSDAY;
            case 2,10: break;
            case Sunday: return DayOfWeek.SUNDAY;
            case DayOfWeek.MONDAY: return DayOfWeek.MONDAY;
        }
        return DayOfWeek.FRIDAY;
    }
    
    /* 
    private DayOfWeek getWeekDayCorrect(int day, final int thursday) {
    int otherDay = day;
    final int Sunday = 0;
        switch(otherDay) {
            default:
            case 1: 
            case 3: return DayOfWeek.THURSDAY;
            case 2,10: break;
            case Sunday: return DayOfWeek.SUNDAY;
            case 7: return DayOfWeek.MONDAY;
        }
        return DayOfWeek.FRIDAY;
    }
    */

    public static void main(String[] args) {
        System.out.println(new q_10().getWeekDayCorrect(10, 1));
    }
    
}

