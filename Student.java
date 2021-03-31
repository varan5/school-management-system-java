public class Student {

    private int id;
    private String name;
    private int grade;
    private float feesPaid;
    private float feesTotal;
    private float feesRemaining;

    public Student(int id, String name, int grade) {
        this.feesPaid = 0;
        this.feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public float getRemainingFees() {
        return this.feesTotal - this.feesPaid;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void updataFeesPaid(float moreFees) {
        this.feesPaid += moreFees;
    }

    public int getId() {
        return this.id;
    }

    public float getFeesPaid() {
        return this.feesPaid;
    }

    public float getFeesTotal() {
        return this.feesTotal;
    }

    public String getName() {
        return this.name;
    } 

    public int getGrade() {
        return this.grade;
    }


}

