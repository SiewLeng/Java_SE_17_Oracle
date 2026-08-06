package q_9.my.city;
import q_9.my.school.*;

    public class School {
    public static void main(String[] args) {
        System.out.println(Classroom.globalKey);
        Classroom room = new Classroom(101, "Mrs. Anderson");
        System.out.println(room.roomNumber);
        System.out.println(Classroom.floor);
        System.out.println(Classroom.teacherName); 
    } 
}