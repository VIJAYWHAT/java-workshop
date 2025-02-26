package clg_management.inherit;

public class Student extends Person {
    
    String dept;
    int rollNo;
    
    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getDept() {
        return dept;
    }

    public void doActivity() {
        System.out.println("Student will be attending the exams.");
    }

    void takeEvaluation() {
        System.out.println("Student Take an evaluation");
    }
    
}
