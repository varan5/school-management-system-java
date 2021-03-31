import java.util.List;

public class School {
    
    private List<Teacher> teachers;
    private List<Student> students;
    private float totalMoneyEarned;
    private float totalMoneySpent;  

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        this.totalMoneyEarned = 0;
        this.totalMoneySpent = 0;
    }

    public List<Teacher> getTeachers() {
        return this.teachers;
    }
    
    public List<Student> getStudents() {
        return this.students;
    }
    
    public float getTotalMoneyEarned() {
        return this.totalMoneyEarned;
    }
    
    public float getTotalMoneySpent() {
        return this.totalMoneySpent;
    }
    
    public void setTeachers(Teacher teacher) {
        this.teachers.add(teacher);
    }
    
    public void setStudents(Student student) {
        this.students.add(student);
    }
    
    public void setTotalMoneySpent(float money) {
        this.totalMoneySpent -= money;
    }
    
    public void setTotalMoneyEarned(float money) {
        this.totalMoneyEarned = money;
    }
    
}
