import java.util.ArrayList;
public class Main {

    public static void main(String args[]) {
        Teacher lizzy = new Teacher(1, "Lizzy", 500);
        Teacher mellisa = new Teacher(2, "Mellisa", 700);
        Teacher vann = new Teacher(3, "Vann", 600);
        ArrayList<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(mellisa);
        teacherList.add(vann);

        Student tammy = new Student(1, "Tammy", 4);
        Student rakshit = new Student(2, "Rakshit", 12);
        Student rob = new Student(3, "Rob", 8);

        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(tammy);
        studentList.add(rakshit);
        studentList.add(rob);

        School school1 = new School(teacherList, studentList);
        System.out.println("School1 has earned $" + school1.getTotalMoneyEarned());
        System.out.println("Tammy's fees at beginning " + tammy.getRemainingFees());
        tammy.updataFeesPaid(100);
        System.out.println("Tammy's fees after paying 100 $ " + tammy.getRemainingFees());
        System.out.println("Rob's fees at beginning " + rob.getRemainingFees());   
        rob.updataFeesPaid(2000);
        System.out.println("Rob's fees after paying 2000 $ " + rob.getRemainingFees());    
    }
}